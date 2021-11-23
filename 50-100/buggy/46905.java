private static java.lang.String formatMessageDigest(final java.security.MessageDigest messageDigest) {
    final java.util.Formatter formatter = new java.util.Formatter();
    for (final byte b : messageDigest.digest()) {
        formatter.format("%02x", b);
    }
    final java.lang.String hash = formatter.toString();
    formatter.close();
    return hash;
}