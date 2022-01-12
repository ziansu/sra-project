private static java.security.KeyStore loadKeyStore(java.lang.String keyStorePath, java.lang.String ksPassword, java.lang.String type) throws java.io.IOException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
    java.io.InputStream fis = null;
    try {
        char[] keypassChar = ksPassword.toCharArray();
        java.security.KeyStore keyStore = java.security.KeyStore.getInstance(type);
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(keyStorePath);
        keyStore.load(fileInputStream, keypassChar);
        return keyStore;
    } finally {
        if (fis != null) {
            fis.close();
        }
    }
}