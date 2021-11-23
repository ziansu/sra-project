public void createUser(User objUser) {
    UserDAO objUserDAO = null;
    try {
        objUserDAO.insert(objUser);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}