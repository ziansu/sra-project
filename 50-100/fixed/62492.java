public void write(com.ctrip.hermes.core.transport.command.Command cmd, long timeout, java.util.concurrent.TimeUnit timeUnit) {
    if (!(isClosed())) {
        if (!(m_opQueue.offer(new com.ctrip.hermes.core.transport.endpoint.DefaultEndpointClient.EndpointChannel.WriteOp(cmd, timeout, timeUnit)))) {
            io.netty.channel.ChannelFuture channelFuture = m_channelFuture.get();
            io.netty.channel.Channel channel = null;
            if (channelFuture != null) {
                channel = channelFuture.channel();
            }
            com.ctrip.hermes.core.transport.endpoint.DefaultEndpointClient.log.warn("Send buffer of endpoint channel {} is full", (channel == null ? "null" : com.ctrip.hermes.core.transport.netty.NettyUtils.parseChannelRemoteAddr(channel)));
        }
    }
}