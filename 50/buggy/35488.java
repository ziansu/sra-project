private static void passwordValidation(java.lang.String userName) {
    java.lang.String password = app.Main.enterPassword(userName);
    while ("".equals(password)) {
        java.lang.System.out.println("Invalid password...");
        password = app.Main.enterPassword(userName);
    } 
}