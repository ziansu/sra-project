@java.lang.Override
public io.netty.channel.ChannelHandler call(final io.netty.channel.Channel channel, java.lang.Integer allIdleTimeout) {
    return new io.netty.handler.timeout.IdleStateHandler(0, 0, allIdleTimeout) {
        @java.lang.Override
        protected void channelIdle(io.netty.channel.ChannelHandlerContext ctx, io.netty.handler.timeout.IdleStateEvent evt) throws java.lang.Exception {
            if (org.jocean.http.util.Nettys.LOG.isInfoEnabled()) {
                org.jocean.http.util.Nettys.LOG.info("channelIdle:{} , close channel[{}]", evt.state().name(), ctx.channel());
            }
            ctx.channel().close();
        }
    };
}