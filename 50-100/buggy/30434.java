public boolean createNewUser(java.lang.String username, java.lang.String password) {
    data.User u;
    try {
        u = getUserByUserName(username);
        return false;
    } catch (javax.persistence.NoResultException nre) {
        u = new data.User();
        u.setUsername(username);
        u.setPassword(password);
        u.setRole(UserRole.ROLE_USER);
        em.persist(u);
        return true;
    }
}