private static java.lang.String hash(java.lang.String s) {
    java.security.MessageDigest md = null;
    java.lang.String ret = null;
    try {
        md = java.security.MessageDigest.getInstance("SHA-1");
        ret = java.util.Base64.getEncoder().encodeToString(md.digest(s.getBytes()));
    } catch (java.security.NoSuchAlgorithmException e) {
        e.printStackTrace();
    }
    return ret;
}