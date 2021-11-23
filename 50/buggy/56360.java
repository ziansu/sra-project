private boolean signIn(java.lang.String username, java.lang.String password) {
    try {
        return org.apache.wicket.authroles.authentication.AuthenticatedWebSession.get().signIn(username, password);
    } catch (org.sqlproc.engine.SqlProcessorException e) {
        onSignInError();
        return false;
    }
}