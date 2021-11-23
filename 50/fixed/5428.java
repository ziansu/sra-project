@java.lang.Override
public long transferFrom(java.nio.channels.FileChannel src, long position, long count) throws java.io.IOException {
    handleIdleTimeout();
    return sink.transferFrom(src, position, count);
}