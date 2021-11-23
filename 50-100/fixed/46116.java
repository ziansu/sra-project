public com.consoleconnect.mw.sonarqube.sample.entity.User create(java.lang.String email, java.lang.String password) {
    if (email2User.containsKey(email)) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%s already exist", email));
    }
    com.consoleconnect.mw.sonarqube.sample.entity.User user = new com.consoleconnect.mw.sonarqube.sample.entity.User(java.util.UUID.randomUUID().toString());
    user.setEmail(email);
    user.setPassword(password);
    email2User.put(email, user);
    return user;
}