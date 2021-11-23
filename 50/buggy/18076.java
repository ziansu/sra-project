private void accessKeyStore() throws java.security.KeyStoreException {
    java.security.KeyStore keyStore = makeSecurityService().getKeystore();
    keyStore.aliases();
}