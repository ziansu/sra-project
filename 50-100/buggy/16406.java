@java.lang.Override
public void userEventTriggered(io.netty.channel.ChannelHandlerContext ctx, java.lang.Object evt) throws java.lang.Exception {
    if (evt instanceof io.netty.handler.timeout.IdleStateEvent) {
        io.netty.handler.timeout.IdleState e = ((io.netty.handler.timeout.IdleStateEvent) (evt)).state();
        if (e == (io.netty.handler.timeout.IdleState.ALL_IDLE)) {
            ctx.close();
        }
    }
}