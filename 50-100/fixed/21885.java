@java.lang.Override
public io.grpc.internal.ReadableBuffers.ByteReadableBufferWrapper readBytes(int length) {
    checkReadable(length);
    java.nio.ByteBuffer buffer = bytes.duplicate();
    buffer.limit(((bytes.position()) + length));
    bytes.position(((bytes.position()) + length));
    return new io.grpc.internal.ReadableBuffers.ByteReadableBufferWrapper(buffer);
}