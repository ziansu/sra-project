public void setPasscode(java.lang.String passcode) {
    try {
        java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
        this.passcode = digest.digest(passcode.getBytes());
    } catch (java.security.NoSuchAlgorithmException e) {
        android.util.Log.e(getClass().getName(), "setPasscode: ", e);
    }
}