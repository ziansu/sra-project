private javax.crypto.SecretKey getSecretKey() throws java.security.NoSuchAlgorithmException {
    javax.crypto.KeyGenerator keyGen = javax.crypto.KeyGenerator.getInstance("AES");
    return keyGen.generateKey();
}