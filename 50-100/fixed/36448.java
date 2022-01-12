private java.lang.String buildAuthToken(java.lang.String email, java.lang.String password, java.lang.String time) throws java.io.UnsupportedEncodingException, java.security.NoSuchAlgorithmException {
    java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
    md.update(password.getBytes("UTF-8"));
    java.lang.String hash = new java.lang.String(md.digest(), "UTF-8");
    return (((email + "$") + hash) + "$") + time;
}