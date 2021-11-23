private static final java.lang.String computeMD5SumFile(java.io.File file) throws java.io.IOException {
    java.security.MessageDigest md5Digest;
    try {
        md5Digest = java.security.MessageDigest.getInstance("MD5");
    } catch (java.security.NoSuchAlgorithmException e) {
        throw new java.io.IOException(e);
    }
    try (java.io.InputStream is = new java.io.FileInputStream(file)) {
        new java.security.DigestInputStream(is, md5Digest);
    }
    return new java.math.BigInteger(1, md5Digest.digest()).toString(16);
}