protected static java.lang.String getString(java.nio.ByteBuffer buf) {
    byte[] bytes = new byte[0];
    if (buf != null) {
        int size = buf.remaining();
        bytes = new byte[size];
        buf.get(bytes, buf.position(), size);
    }
    java.lang.String record = new java.lang.String(bytes, java.nio.charset.Charset.forName("UTF-8"));
    return record;
}