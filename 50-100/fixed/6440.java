private synchronized void closeWithoutMessage() {
    if ((this.state) == (org.opendaylight.protocol.bgp.rib.impl.BGPSessionImpl.State.IDLE)) {
        return ;
    }
    org.opendaylight.protocol.bgp.rib.impl.BGPSessionImpl.LOG.info("Closing session: {}", this);
    this.channel.close().addListener(new io.netty.channel.ChannelFutureListener() {
        @java.lang.Override
        public void operationComplete(final io.netty.channel.ChannelFuture future) throws java.lang.Exception {
            com.google.common.base.Preconditions.checkArgument(future.isSuccess(), "Channel failed to close: %s", future.cause());
        }
    });
    this.state = org.opendaylight.protocol.bgp.rib.impl.BGPSessionImpl.State.IDLE;
    removePeerSession();
}