public boolean userRegistration(java.lang.String login, java.lang.String password) {
    helper.TimeHelper.sleep(2000);
    java.lang.String hashed = org.mindrot.jbcrypt.BCrypt.hashpw(password, org.mindrot.jbcrypt.BCrypt.gensalt(12));
    return userDAO.addNewUser(login, hashed);
}