private static java.lang.String tryHashStringSha256(android.content.Context context, java.lang.String input) {
    java.lang.String salt = net.hockeyapp.android.Constants.createSalt(context);
    try {
        java.security.MessageDigest hash = java.security.MessageDigest.getInstance("SHA-256");
        hash.reset();
        hash.update(input.getBytes());
        hash.update(salt.getBytes());
        byte[] hashedBytes = hash.digest();
        return net.hockeyapp.android.Constants.bytesToHex(hashedBytes);
    } catch (java.security.NoSuchAlgorithmException e) {
        return input;
    }
}