public void setCurrentUser(org.javarosa.core.model.User user, java.lang.String password) {
    this.user = user;
    this.user.setCachedPwd(password);
    this.key = user.getWrappedKey();
}