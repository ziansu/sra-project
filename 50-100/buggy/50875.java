private javax.net.ssl.KeyManagerFactory loadKeyManagerFactory(java.security.KeyStore ks, java.lang.String keyStorePassword, java.lang.String keyStore, java.lang.String keyManagerAlgorithm) throws java.io.IOException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException {
    javax.net.ssl.KeyManagerFactory kmf = javax.net.ssl.KeyManagerFactory.getInstance(keyManagerAlgorithm);
    char[] passPhrase = (keyStorePassword != null) ? keyStorePassword.toCharArray() : null;
    loadKeyStore(ks, passPhrase, keyStore);
    kmf.init(ks, passPhrase);
    return kmf;
}