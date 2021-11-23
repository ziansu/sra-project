@java.lang.Override
public void channelInactive(final io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    super.channelInactive(ctx);
    org.opendaylight.openflowjava.protocol.impl.core.connection.AbstractOutboundQueueManager.LOG.debug("Channel {} initiating shutdown...", ctx.channel());
    shuttingDown = true;
    final long entries = currentQueue.startShutdown();
    org.opendaylight.openflowjava.protocol.impl.core.connection.AbstractOutboundQueueManager.LOG.debug("Cleared {} queue entries from channel {}", entries, ctx.channel());
    scheduleFlush();
}