@java.lang.Override
public void channelActive(com.lambdaworks.redis.protocol.ChannelHandlerContext ctx) throws java.lang.Exception {
    if ((commandHandler) == null) {
        this.commandHandler = ctx.pipeline().get(com.lambdaworks.redis.protocol.CommandHandler.class);
    }
    reconnectScheduleTimeout = null;
    channel = ctx.channel();
    remoteAddress = channel.remoteAddress();
    com.lambdaworks.redis.protocol.ConnectionWatchdog.logger.debug("{} channelActive({})", logPrefix(), ctx);
    super.channelActive(ctx);
}