private void promptLogin() {
    currentUser = null;
    java.lang.String cpr;
    java.lang.String password;
    java.lang.System.out.println("*** LOGIN *** \nEnter your cpr: ");
    cpr = scanner.next();
    java.lang.System.out.println("Enter your password: ");
    password = scanner.next();
    handleLogin(cpr, password);
    while ((currentUser) == null) {
        java.lang.System.out.println("Wrong login, please try again!");
        java.lang.System.out.println("Enter your cpr: ");
        cpr = scanner.next();
        java.lang.System.out.println("Enter your password: ");
        password = scanner.next();
        handleLogin(cpr, password);
    } 
}