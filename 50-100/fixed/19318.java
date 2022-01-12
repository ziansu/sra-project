public static boolean verify(java.lang.String hash, java.lang.String password) throws java.security.NoSuchAlgorithmException {
    java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
    java.lang.String passHash = digest.digest(password.getBytes(java.nio.charset.StandardCharsets.UTF_8)).toString();
    if (passHash.equals(hash)) {
        return true;
    }
    return false;
}