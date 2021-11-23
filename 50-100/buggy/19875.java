public static long deriveLong(byte[] key) {
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocate(((java.lang.Long.SIZE) / (java.lang.Byte.SIZE)));
    buffer.put(key);
    buffer.flip();
    return buffer.getLong();
}