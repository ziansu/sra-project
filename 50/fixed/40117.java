public void updateUser(User objUser) {
    UserDAO objUserDAO = null;
    try {
        objUserDAO = new UserDAO();
        objUserDAO.update(objUser);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}