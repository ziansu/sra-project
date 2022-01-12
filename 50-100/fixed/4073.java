public static java.lang.String computeMD5(java.lang.String entity) {
    if ((entity == null) || (entity.isEmpty())) {
        return "";
    }
    java.security.MessageDigest md5;
    try {
        md5 = java.security.MessageDigest.getInstance("MD5");
    } catch (java.security.NoSuchAlgorithmException e) {
        throw new java.lang.IllegalArgumentException("An error occurred while getting the message digest", e);
    }
    return org.apache.commons.codec.binary.Hex.encodeHexString(md5.digest(entity.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
}