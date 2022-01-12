public static char[] generatePassword(int length, java.lang.String abc) {
    char[] pw = new char[length];
    java.security.SecureRandom rnd = null;
    try {
        rnd = java.security.SecureRandom.getInstanceStrong();
    } catch (java.security.NoSuchAlgorithmException e) {
        rnd = new java.security.SecureRandom();
    }
    for (int i = 0; i < (pw.length); i++) {
        pw[i] = abc.charAt(rnd.nextInt(abc.length()));
    }
    return pw;
}