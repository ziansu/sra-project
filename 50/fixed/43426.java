private void persistUsersSessionId(models.common.User user, java.lang.String sessionId) {
    user.setSessionId(sessionId);
    userDao.update(user);
}