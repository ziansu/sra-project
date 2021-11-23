public void updateUser(com.endava.twitt.models.User user) {
    try {
        this.sessionFactory.getCurrentSession().update(user);
        com.endava.twitt.dao.UserDaoImplement.logger.debug(("Person updated successfully, Person Details=" + (user.getEmail())));
    } catch (java.lang.NullPointerException e) {
        com.endava.twitt.dao.UserDaoImplement.logger.error(("Couldn't update user." + e));
    }
}