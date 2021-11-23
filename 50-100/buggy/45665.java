private javax.net.ssl.TrustManagerFactory loadTrustManagerFactory(java.security.KeyStore ts, java.lang.String trustStore, java.lang.String trustStorePassword, java.lang.String trustManagerAlgorithm) throws java.io.IOException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
    javax.net.ssl.TrustManagerFactory tmf = javax.net.ssl.TrustManagerFactory.getInstance(trustManagerAlgorithm);
    char[] passPhrase = (trustStorePassword != null) ? trustStorePassword.toCharArray() : null;
    loadKeyStore(ts, passPhrase, trustStore);
    tmf.init(ts);
    return tmf;
}