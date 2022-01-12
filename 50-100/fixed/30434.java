public boolean createNewUser(java.lang.String username, java.lang.String password) {
    data.User u = getUserByUserName(username);
    if (u != null) {
        return false;
    }else {
        u = new data.User();
        u.setUsername(username);
        u.setPassword(password);
        u.setRole(UserRole.ROLE_USER);
        em.persist(u);
        return true;
    }
}