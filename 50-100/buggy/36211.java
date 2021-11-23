public boolean authorize(java.lang.String passcode) {
    try {
        java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] passbytes = digest.digest(passcode.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        return java.util.Arrays.equals(this.passcode, passbytes);
    } catch (java.security.NoSuchAlgorithmException e) {
        android.util.Log.e(getClass().getName(), "setPasscode: ", e);
    }
    return false;
}