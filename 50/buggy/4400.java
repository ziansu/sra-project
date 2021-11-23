public java.nio.channels.SelectionKey register(java.nio.channels.spi.AbstractSelectableChannel chan, int ops) throws java.nio.channels.ClosedChannelException {
    return register(chan, ops, null);
}