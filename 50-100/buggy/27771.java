private boolean registerNewUser(com.Modelclasses.ApplicationUser user) {
    if ((com.DBcommunication.DBhandlerSingleton.getInstance().getUser(user.getEmail())) == null) {
        com.Modelclasses.PasswordSecurity.hashPassword(user);
        com.DBcommunication.DBhandlerSingleton.getInstance().insertUser(user);
        java.lang.System.out.println("Register Complete");
        return true;
    }
    java.lang.System.out.println("Register not possible");
    return false;
}