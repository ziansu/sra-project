public static java.security.KeyPair genKeys() throws java.lang.Exception {
    try {
        java.security.Security.addProvider(new BouncyCastleProvider());
        org.bouncycastle.jce.spec.ECParameterSpec ecSpec = org.bouncycastle.jce.ECNamedCurveTable.getParameterSpec("prime192v1");
        java.security.KeyPairGenerator g;
        g = java.security.KeyPairGenerator.getInstance("ECDSA", "BC");
        g.initialize(ecSpec);
        java.security.KeyPair pair = g.generateKeyPair();
        return pair;
    } catch (java.lang.Exception e) {
        return null;
    }
}