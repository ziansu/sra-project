@java.lang.Override
public org.msgpack.core.buffer.MessageBuffer next() throws java.io.IOException {
    java.nio.ByteBuffer b = buffer.sliceAsByteBuffer();
    int ret = channel.read(b);
    if (ret == (-1)) {
        return null;
    }
    b.flip();
    return (b.remaining()) == 0 ? null : buffer.slice(0, b.limit());
}