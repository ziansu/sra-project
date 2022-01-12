public void logout() {
    java.net.Authenticator.setDefault(mAuthenticator);
    try {
        openGetConnection(((de.epgpaid.EPGpaidDataConnection.DOMAIN) + "logout.php"));
        closeHttpConnection();
    } catch (java.lang.Exception e1) {
        e1.printStackTrace();
    }
    closeHttpConnection();
    java.net.Authenticator.setDefault(null);
    de.epgpaid.SSLTool.resetCertificateValidation();
}