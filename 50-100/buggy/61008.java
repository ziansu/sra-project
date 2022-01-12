public void searchDocument() {
    java.util.Scanner in = new java.util.Scanner(java.lang.System.in);
    java.lang.String query = "";
    int i = 0;
    java.lang.System.out.println(("Search By: \n" + ("1. Title\n" + "2. Author")));
    i = edu.txstate.library.InputValidator.validate(2);
    if (i == 1) {
        java.lang.System.out.println("Enter Title");
        query = in.nextLine();
    }else {
        java.lang.System.out.println("Enter Author's Name:");
        query = in.nextLine();
    }
    edu.txstate.library.LibrarySystem.getInstance().performSearch(i, query);
}