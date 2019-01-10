import java.util.*;

public class Email {
	
	// variables to use in the program
	private String fname;
	private String lname;
	private String pass;
	private int length;
	private String email;
	private String depat;
	private String altemail;
	private int emailcap;
	private String changepass;

	public Email(String fname, String lname)
	{	
		this.fname = fname;
		this.lname = lname;
		
		//System.out.println("Employee: " + this.fname + " " + this.lname);
		
		this.depat = setDepart();
		//System.out.println("Department: " + this.depat);
		
		this.email = genemail();
		//System.out.println("Your email is: " + this.email);
		
		this.pass = passgen(10);
		System.out.println("Your password is: " +this.pass);
	}
	
	public String setDepart() {
		
		System.out.print(fname + " " + lname + " choose your department code from the following\n1: Hackethon\n2: Development\n3: Treasury\nEnter department code: ");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n==1) {
			return "Hackethon";
		}
		else if (n==2) {
			return "Development";
		}
		else if (n==3) {
			return "Treasury";
		}
		else
			return "It is not a correct department code";
	}
	
	private String genemail() {
		
		String email = fname.toLowerCase() + "." + lname.toLowerCase() + "@" + depat.toLowerCase() + "." + "pantherhackers.com";
		return email;
	}
	
	private String passgen(int passlen) {
		
		String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+= {}[];<>?";
		char[] pass = new char[passlen];
		for (int i=0; i< passlen; i++)
		{
			int rand = (int) (Math.random() * passSet.length());
			pass[i] = passSet.charAt(rand);
		}
		return new String (pass);
		
	}
	
	public void alternateemail(String altemail)
	{
		this.altemail = altemail;
	}
	
	public void setemailcap(int emailcap)
	{
		this.emailcap = emailcap;
	}
	
	public void changepassword(String changepass)
	{
		this.changepass = changepass;
	}
	
	public int getemailcap()
	{
		return emailcap;
	}
	
	public String getaltemail()
	{
		return altemail;
	}
	
	public String getchangepassword()
	{
		return changepass;
	}
	
	public String toString() {
		
		return "Employee name: " + fname + " " + lname
				+ "\nCompany email: " + email + "\nMailbox capacity: " + emailcap + "gb";
	}
}
