private static java.lang.String encrypt(java.lang.String algorithm, java.lang.String clearText) {
    try {
        java.security.MessageDigest pwd = java.security.MessageDigest.getInstance(algorithm);
        pwd.update(clearText.getBytes());
        return com.sun.org.apache.xerces.internal.impl.dv.util.HexBin.encode(pwd.digest());
    } catch (java.security.NoSuchAlgorithmException e) {
        throw new java.lang.RuntimeException(("No Such Algorithm: " + algorithm));
    }
}