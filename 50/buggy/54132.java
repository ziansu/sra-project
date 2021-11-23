private byte[] getBytes(final java.lang.String s, final java.lang.String charset) {
    try {
        final byte[] bytes = s.getBytes(charset);
        return bytes;
    } catch (java.io.UnsupportedEncodingException e) {
        return s.getBytes();
    }
}