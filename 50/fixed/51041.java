@java.lang.Override
public void exceptionCaught(io.netty.channel.ChannelHandlerContext ctx, java.lang.Throwable cause) throws java.lang.Exception {
    log.log(java.util.logging.Level.WARNING, cause.getMessage(), cause);
    ctx.close();
}