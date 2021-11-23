public static void main(java.lang.String[] args) {
    java.lang.System.out.println("TESTING");
    edu.txstate.library.LibrarySystem alkek = edu.txstate.library.LibrarySystem.getInstance();
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("---Calling loadData from LibrarySystem---");
    java.lang.System.out.println("Successfully Loaded Data");
    edu.txstate.library.User userboi = new edu.txstate.library.StudentUser("Bob", "Sammy", "98765");
    alkek.addUser(userboi);
    java.lang.System.out.println("Saving Data to users.txt");
    java.lang.System.out.println("Saved Data to users.txt, check the file to see if output is correct.");
}