public static java.lang.String sha256(java.lang.String original) throws java.security.NoSuchAlgorithmException {
    java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
    md.update(original.getBytes());
    byte[] digest = md.digest();
    return new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHexString(digest));
}