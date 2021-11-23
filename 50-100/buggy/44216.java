private void login() {
    boolean validUserName = false;
    while (!validUserName) {
        java.lang.System.out.println("Please enter user name to log in: ");
        myUserName = myScanner.next();
        if (true) {
            validUserName = true;
            chooseUserTypeMenuView();
        }else {
            java.lang.System.out.println("Invalid User Name!");
        }
    } 
}