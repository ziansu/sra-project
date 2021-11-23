public static boolean setKeyEntry(java.security.KeyStore keyStore, java.lang.String alias, java.security.PrivateKey privateKey, char[] password, java.security.cert.Certificate certificate) {
    boolean success = false;
    try {
        keyStore.setKeyEntry(alias, privateKey, password, new java.security.cert.Certificate[]{ certificate });
    } catch (java.security.KeyStoreException e) {
        e.printStackTrace();
    }
    return success;
}