public void deleteUser(java.lang.String userEmail) {
    try {
        com.endava.twitt.models.User user = getUserByName(userEmail);
        if (null != user) {
            sessionFactory.getCurrentSession().delete(user);
        }
        com.endava.twitt.dao.UserDaoImplement.logger.debug(("Person deleted successfully, person details=" + (user.getEmail())));
    } catch (java.lang.NullPointerException e) {
        com.endava.twitt.dao.UserDaoImplement.logger.error(("Couldn't deleted user." + e));
    }
}