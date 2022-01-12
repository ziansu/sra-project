public static java.lang.String encrypt(java.lang.String toEncrypt) throws java.io.UnsupportedEncodingException, java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException {
    java.lang.String key = "Bar12345Bar12345";
    java.security.Key aesKey = new javax.crypto.spec.SecretKeySpec(key.getBytes(), "AES");
    javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES");
    cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, aesKey);
    byte[] encrypted = cipher.doFinal(toEncrypt.getBytes("UTF8"));
    java.lang.System.err.println(javax.xml.bind.DatatypeConverter.printBase64Binary(encrypted));
    return new java.lang.String(javax.xml.bind.DatatypeConverter.printBase64Binary(encrypted));
}