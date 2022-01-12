public java.lang.Integer login(java.lang.String emailAddress, java.lang.String password) {
    if ((emailAddress == null) || (password == null)) {
        return null;
    }
    org.tradingsocial.model.User user = userDAO.loginAsUser(emailAddress, password);
    if (user == null) {
        return null;
    }
    return user.getId();
}