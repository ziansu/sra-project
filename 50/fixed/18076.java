private void accessKeyStore() throws java.security.KeyStoreException {
    makeSecurityService().getKeystore().aliases();
}