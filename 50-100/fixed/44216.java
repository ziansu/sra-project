private void login() {
    boolean validUserName = false;
    while (!validUserName) {
        java.lang.System.out.print("Please enter user name to log in: ");
        myUserName = myScanner.next();
        java.lang.System.out.println();
        if (true) {
            validUserName = true;
        }else {
            java.lang.System.out.println("Invalid User Name!");
        }
    } 
}