@java.lang.Override
public long transferFrom(final java.nio.channels.FileChannel src, final long position, final long count) throws java.io.IOException {
    if (org.xnio.Bits.anyAreSet(((io.undertow.conduits.DeflatingStreamSinkConduit.SHUTDOWN) | (io.undertow.conduits.DeflatingStreamSinkConduit.CLOSED)), state)) {
        throw new java.nio.channels.ClosedChannelException();
    }
    if (!(performFlushIfRequired())) {
        return 0;
    }
    return src.transferTo(position, count, new org.xnio.conduits.ConduitWritableByteChannel(this));
}