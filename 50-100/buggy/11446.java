public static int bytesToInt(java.nio.ByteOrder order, byte... bytes) {
    if ((bytes.length) != 4) {
        throw new java.lang.IllegalArgumentException("Bytes count must be 4");
    }
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.wrap(bytes, 0, 4);
    buffer.order(order);
    return buffer.getShort();
}