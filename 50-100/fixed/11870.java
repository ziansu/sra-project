public static java.lang.String hmacSHA256(byte[] secret, java.lang.String message) {
    java.lang.String hash = null;
    try {
        javax.crypto.Mac sha256_HMAC = javax.crypto.Mac.getInstance("HmacSHA256");
        javax.crypto.spec.SecretKeySpec secret_key = new javax.crypto.spec.SecretKeySpec(secret, "HmacSHA256");
        sha256_HMAC.init(secret_key);
        hash = new java.lang.String(android.util.Base64.encode(sha256_HMAC.doFinal(message.getBytes()), Base64.DEFAULT));
    } catch (java.lang.Exception e) {
        android.util.Log.e(ke.co.interintel.nikobizzapi.encryption.ApiSecurity.TAG, "Error", e);
    }
    return hash;
}