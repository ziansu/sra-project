private boolean signIn(java.lang.String username, java.lang.String password) {
    return org.apache.wicket.authroles.authentication.AuthenticatedWebSession.get().signIn(username, password);
}