public static short bytesToShort(java.nio.ByteOrder order, byte... bytes) {
    if ((bytes.length) != 2) {
        throw new java.lang.IllegalArgumentException("Bytes count must be 2");
    }
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.wrap(bytes, 0, 2);
    buffer.order(order);
    return buffer.getShort();
}