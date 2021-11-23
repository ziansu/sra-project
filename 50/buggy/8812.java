@java.lang.Override
protected final void channelRead0(final io.netty.channel.ChannelHandlerContext ctx, final org.opendaylight.yangtools.yang.binding.Notification msg) {
    org.opendaylight.protocol.bgp.rib.impl.BGPSessionImpl.LOG.debug("Message was received: {}", msg);
    try {
        this.handleMessage(msg);
    } catch (final org.opendaylight.protocol.bgp.parser.BGPDocumentedException e) {
        this.terminate(e);
    }
}