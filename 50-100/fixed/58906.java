private static byte[] sign(java.lang.String input, java.lang.String key, java.lang.String method) throws java.io.UnsupportedEncodingException, java.security.InvalidKeyException, java.security.NoSuchAlgorithmException {
    javax.crypto.Mac hmac = javax.crypto.Mac.getInstance(method);
    javax.crypto.SecretKey secretKey = new javax.crypto.spec.SecretKeySpec(key.getBytes(), method);
    hmac.init(secretKey);
    return hmac.doFinal(input.getBytes());
}