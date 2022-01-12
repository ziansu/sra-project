private long getCehcksumPackage() {
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocate(java.lang.Long.BYTES);
    buffer.put(java.util.Arrays.copyOfRange(getUdpPacket().getData(), protocolPackets.AlternatingBitPacket.CHECKOFF, ((protocolPackets.AlternatingBitPacket.CONTENTOFF) - 1)));
    buffer.flip();
    return buffer.getLong();
}