public static java.lang.String decryptWithStoredKey(java.lang.String privateK, java.lang.String text) {
    try {
        java.lang.String strippedKey = com.e2e.message.crypto.Crypto.stripPrivateKeyHeaders(privateK);
        java.security.PrivateKey privateKey = com.e2e.message.crypto.Crypto.getRSAPrivateKeyFromString(privateK);
        return com.e2e.message.crypto.RSA.decryptFromBase64(privateKey, text);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}