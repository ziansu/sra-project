private static java.lang.String SecretString(java.lang.String body, java.lang.String key) {
    javax.crypto.SecretKeyFactory skf;
    java.security.spec.KeySpec spec;
    javax.crypto.SecretKey secret;
    try {
        skf = javax.crypto.SecretKeyFactory.getInstance("PBKDF2WithHMACSHA256");
    } catch (java.security.NoSuchAlgorithmException e) {
        return "";
    }
    spec = new javax.crypto.spec.PBEKeySpec(body.toCharArray(), key.getBytes(), com.sbacs.phoneapp.HMAC.HMACHelper.iterations, com.sbacs.phoneapp.HMAC.HMACHelper.secret_length);
    try {
        secret = skf.generateSecret(spec);
    } catch (java.security.spec.InvalidKeySpecException e) {
        return "";
    }
    return new java.lang.String(secret.getEncoded());
}