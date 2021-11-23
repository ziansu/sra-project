@java.lang.Override
public long transferFrom(org.xnio.channels.StreamSourceChannel source, long count, java.nio.ByteBuffer throughBuffer) throws java.io.IOException {
    handleIdleTimeout();
    return sink.transferFrom(source, count, throughBuffer);
}