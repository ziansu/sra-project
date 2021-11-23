@java.lang.Override
public long transferFrom(java.nio.channels.FileChannel src, long position, long count) throws java.io.IOException {
    handleIdleTimeout();
    long r = sink.transferFrom(src, position, count);
    return r;
}