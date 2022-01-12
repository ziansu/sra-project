private static java.security.PrivateKey readPrivateKey(java.io.InputStream privateKey) throws java.io.FileNotFoundException, java.io.IOException, java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException {
    java.security.spec.PKCS8EncodedKeySpec keySpec = new java.security.spec.PKCS8EncodedKeySpec(org.apache.commons.io.IOUtils.toByteArray(privateKey));
    java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("DSA");
    java.security.PrivateKey key = keyFactory.generatePrivate(keySpec);
    return key;
}