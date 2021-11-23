public static java.security.KeyPair genKeys() throws java.lang.Exception {
    java.security.Security.addProvider(new BouncyCastleProvider());
    org.bouncycastle.jce.spec.ECParameterSpec ecSpec = org.bouncycastle.jce.ECNamedCurveTable.getParameterSpec("prime192v1");
    java.security.KeyPairGenerator g;
    java.security.SecureRandom secureRandom = java.security.SecureRandom.getInstance("SHA1PRNG", "SUN");
    try {
        g = java.security.KeyPairGenerator.getInstance("ECDSA", "BC");
        g.initialize(ecSpec, secureRandom);
        java.security.KeyPair pair = g.generateKeyPair();
        return pair;
    } catch (java.lang.Exception e) {
        return null;
    }
}