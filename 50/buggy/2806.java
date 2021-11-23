public void setPassword(java.lang.String password) {
    this.password = seed.domain.User.encrypt("SHA1", password);
}