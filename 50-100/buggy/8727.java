public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.lang.String alg = "AES";
    java.lang.String key = "TheBestSecreteKe";
    java.security.Key key2 = new javax.crypto.spec.SecretKeySpec(key.getBytes(), alg);
    javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(alg);
    cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, key2);
    java.lang.String data = "TestString";
    byte[] encVal = cipher.doFinal(data.getBytes());
    java.lang.String encryptedValue = java.util.Base64.getEncoder().encodeToString(encVal);
    java.lang.System.out.println(encryptedValue);
}