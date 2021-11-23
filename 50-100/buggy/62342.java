protected static java.lang.String getJsonString(java.nio.ByteBuffer buf) {
    byte[] bytes = null;
    if (buf != null) {
        int size = buf.remaining();
        bytes = new byte[size];
        buf.get(bytes, buf.position(), size);
    }
    java.lang.String jsonString = new java.lang.String(bytes, java.nio.charset.Charset.forName("UTF-8"));
    return jsonString;
}