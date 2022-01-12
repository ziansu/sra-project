public User findUser(java.lang.String strUsername, java.lang.String strPassword) {
    User objUser = null;
    UserDAO objUserDAO = null;
    try {
        objUser = objUserDAO.getUserByEmailAndPassword(strUsername, strPassword);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return objUser;
}