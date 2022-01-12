private static java.lang.String formatMessageDigest(final java.security.MessageDigest messageDigest) {
    try (final java.util.Formatter formatter = new java.util.Formatter()) {
        for (final byte b : messageDigest.digest()) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }
}