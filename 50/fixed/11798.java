public synchronized void login(java.lang.String username, java.lang.String password) throws java.io.IOException, javax.security.auth.login.FailedLoginException {
    login(username, password.toCharArray());
}