public static byte[] getPskToken() {
    try {
        java.security.SecureRandom sr = java.security.SecureRandom.getInstanceStrong();
        byte[] nonce = new byte[16];
        sr.nextBytes(nonce);
        return nonce;
    } catch (java.security.NoSuchAlgorithmException nsa) {
        throw new java.lang.RuntimeException("Could not generate secure nonce", nsa);
    }
}