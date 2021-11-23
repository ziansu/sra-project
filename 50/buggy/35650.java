private static java.security.Key generateKey(java.lang.String Key) {
    return new javax.crypto.spec.SecretKeySpec(Key.getBytes(), "AES");
}