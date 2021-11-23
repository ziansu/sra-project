java.util.Optional<java.nio.ByteBuffer> readOptionalByteBuffer() throws net.digihippo.timecache.netty.MessageReader.EndOfMessages {
    final int length = readInt();
    if (length == 0) {
        return java.util.Optional.empty();
    }
    checkAvailable(length);
    final java.nio.ByteBuffer result = java.nio.ByteBuffer.allocate(length);
    result.put(byteBuffer.array(), byteBuffer.position(), ((byteBuffer.position()) + length));
    result.position(length);
    result.flip();
    return java.util.Optional.of(result);
}