private static byte[] decodeBase64Digest(java.lang.String base64Digest) {
    java.lang.String expectedPrefix = "sha1-";
    if (!(base64Digest.startsWith(expectedPrefix))) {
        throw new java.lang.IllegalArgumentException(((base64Digest + " did not start with ") + expectedPrefix));
    }
    base64Digest = base64Digest.replaceFirst(expectedPrefix, "");
    byte[] bytes = new byte[0];
    try {
        bytes = com.couchbase.lite.support.Base64.decode(base64Digest);
    } catch (java.io.IOException e) {
        throw new java.lang.IllegalArgumentException(e);
    }
    return bytes;
}