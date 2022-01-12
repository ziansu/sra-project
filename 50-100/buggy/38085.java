public model.User login(java.lang.String userName, java.lang.String password) {
    try {
        javax.persistence.TypedQuery<model.User> query = entityManager.createQuery("SELECT u from User u WHERE u.userName = :userName AND u.password = :password", model.User.class);
        query.setParameter("userName", userName);
        query.setParameter("password", password);
        daos.UserDAO.logger.debug("LOGIN");
        model.User user = query.getSingleResult();
        return user;
    } catch (javax.persistence.PersistenceException e) {
        daos.UserDAO.logger.error(("Exception in login: " + e));
        return null;
    }
}