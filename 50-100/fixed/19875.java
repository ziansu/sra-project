public static long deriveLong(byte[] key) {
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocate(((java.lang.Long.SIZE) / (java.lang.Byte.SIZE)));
    buffer.put(key, 0, ((java.lang.Long.SIZE) / (java.lang.Byte.SIZE)));
    buffer.flip();
    return buffer.getLong();
}