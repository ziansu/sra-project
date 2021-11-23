@java.lang.Override
public long transferFrom(org.xnio.channels.StreamSourceChannel source, long count, java.nio.ByteBuffer throughBuffer) throws java.io.IOException {
    handleIdleTimeout();
    long r = sink.transferFrom(source, count, throughBuffer);
    return r;
}