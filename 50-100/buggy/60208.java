@java.lang.Override
public long transferFrom(final org.xnio.channels.StreamSourceChannel source, final long count, final java.nio.ByteBuffer throughBuffer) throws java.io.IOException {
    if (org.xnio.Bits.anyAreSet(((io.undertow.conduits.DeflatingStreamSinkConduit.SHUTDOWN) | (io.undertow.conduits.DeflatingStreamSinkConduit.CLOSED)), state)) {
        throw new java.nio.channels.ClosedChannelException();
    }
    if (!(performFlushIfRequired())) {
        return 0;
    }
    return org.xnio.IoUtils.transfer(source, count, throughBuffer, new org.xnio.conduits.ConduitWritableByteChannel(this));
}