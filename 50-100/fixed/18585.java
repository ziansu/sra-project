public static java.lang.String decrypt(java.lang.String toEncrypt) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException {
    java.lang.String key = "Bar12345Bar12345";
    java.security.Key aesKey = new javax.crypto.spec.SecretKeySpec(key.getBytes(), "AES");
    javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES");
    cipher.init(javax.crypto.Cipher.DECRYPT_MODE, aesKey);
    java.lang.String decrypted = new java.lang.String(cipher.doFinal(javax.xml.bind.DatatypeConverter.parseBase64Binary(toEncrypt)));
    return new java.lang.String(decrypted);
}