public static byte[] getMD5(final java.lang.String text) {
    try {
        final java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        final byte[] data = text.getBytes("UTF-8");
        md.update(data);
        final byte[] digest = md.digest();
        return digest;
    } catch (java.security.NoSuchAlgorithmException | java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
        return new byte[0];
    }
}