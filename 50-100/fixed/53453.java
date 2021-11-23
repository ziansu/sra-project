boolean awaitLogin() {
    try {
        if (!(loginSuccess.await(10L, java.util.concurrent.TimeUnit.SECONDS))) {
            disconnectAbnormally("Timed out waiting for login response");
            throw new java.lang.RuntimeException("Timed out waiting for login response");
        }
        return isLoggedIn();
    } catch (java.lang.InterruptedException e) {
        errorStack.push(new com.google.sitebricks.mail.MailClientHandler.Error(null, e.getMessage(), wireTrace.list()));
        throw new java.lang.RuntimeException("Interruption while awaiting server login", e);
    }
}