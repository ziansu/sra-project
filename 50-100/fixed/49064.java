@java.lang.Override
public void channelRead(io.netty.channel.ChannelHandlerContext ctx, java.lang.Object msg) throws java.lang.Exception {
    org.mycat.netty.mysql.MySQLHandshakeHandler.logger.info("channel read {}", msg);
    org.mycat.netty.ProtocolTransport transport = new org.mycat.netty.ProtocolTransport(ctx.channel(), ((io.netty.buffer.ByteBuf) (msg)));
    if ((transport.getSession()) == null) {
        userExecutor.execute(new org.mycat.netty.mysql.MySQLHandshakeHandler.AuthTask(ctx, transport));
    }else {
        ctx.fireChannelRead(msg);
    }
}