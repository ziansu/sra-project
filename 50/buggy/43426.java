private void persistUsersSessionId(java.lang.String email, java.lang.String sessionId) {
    models.common.User user = userDao.findByEmail(email);
    user.setSessionId(sessionId);
    userDao.update(user);
}