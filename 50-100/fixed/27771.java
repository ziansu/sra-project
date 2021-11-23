private boolean registerNewUser(com.Modelclasses.ApplicationUser user) {
    if ((com.DBcommunication.DBhandlerSingleton.getInstance().getUser(user.getEmail())) == null) {
        com.Modelclasses.PasswordSecurity.hashPassword(user);
        com.DBcommunication.DBhandlerSingleton.getInstance().insertUser(user);
        return true;
    }
    return false;
}