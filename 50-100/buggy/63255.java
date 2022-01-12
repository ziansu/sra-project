public com.accesso.challengeladder.model.User createUser(java.lang.String username, java.lang.String email) {
    com.accesso.challengeladder.model.User user = new com.accesso.challengeladder.model.User();
    try {
        user.setUsername(username);
        user.setEmail(email);
        user.setCreatedAt(new java.util.Date());
        userDao.create(user);
    } catch (java.lang.Exception e) {
        com.accesso.challengeladder.services.UserService.logger.error(("Exception..." + (e.getMessage())));
        return null;
    }
    return user;
}