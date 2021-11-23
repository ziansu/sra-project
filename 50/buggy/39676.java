public void deleteUser(User objUser) {
    UserDAO objUserDAO = null;
    try {
        objUserDAO.delete(objUser);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}