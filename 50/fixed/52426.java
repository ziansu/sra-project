@java.lang.Override
public void exceptionCaught(io.netty.channel.ChannelHandlerContext ctx, java.lang.Throwable cause) {
    messageListener.onException(ctx, cause);
    org.logstash.beats.BeatsHandler.logger.error("Exception: {}", cause.getMessage());
    ctx.close();
}