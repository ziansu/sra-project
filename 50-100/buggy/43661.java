protected void serialize(java.lang.String s, java.nio.ByteBuffer buffer) {
    if (s == null) {
        buffer.putInt(0);
    }else {
        buffer.putInt(s.length());
        buffer.put(s.getBytes());
    }
}