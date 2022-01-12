public static void main(java.lang.String[] args) {
    java.lang.System.out.println("TESTING");
    edu.txstate.library.LibrarySystem alkek = edu.txstate.library.LibrarySystem.getInstance();
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("---Calling loadData from LibrarySystem---");
    alkek.loadData();
    java.lang.System.out.println("Successfully Loaded Data");
    java.lang.System.out.println("Adding student user Jerome Maxwell with id 8");
    edu.txstate.library.User userboi = new edu.txstate.library.StudentUser("Bob", "Sammy", "98765");
    alkek.addUser(userboi);
    java.lang.System.out.println("Added Jerome");
    java.lang.System.out.println("Saving Data to users.txt");
    alkek.saveData();
    java.lang.System.out.println("Saved Data to users.txt, check the file to see if output is correct.");
}