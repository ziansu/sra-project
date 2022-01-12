static io.github.olivierlemasle.ca.RootCertificateImpl loadRootCertificate(final java.io.File keystoreFile, final char[] password, final java.lang.String alias) {
    try {
        final java.security.KeyStore keystore = java.security.KeyStore.getInstance(RootCertificateImpl.KEYSTORE_TYPE);
        try (java.io.InputStream stream = new java.io.FileInputStream(keystoreFile)) {
            keystore.load(stream, password);
            return io.github.olivierlemasle.ca.RootCertificateLoader.loadRootCertificate(keystore, alias);
        }
    } catch (java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException | java.io.IOException e) {
        throw new io.github.olivierlemasle.ca.CaException(e);
    }
}