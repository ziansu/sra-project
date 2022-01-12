@java.lang.Override
public void userEventTriggered(io.netty.channel.ChannelHandlerContext ctx, java.lang.Object event) {
    if (event instanceof io.netty.handler.timeout.IdleStateEvent) {
        io.netty.handler.timeout.IdleStateEvent e = ((io.netty.handler.timeout.IdleStateEvent) (event));
        if ((e.state()) == (io.netty.handler.timeout.IdleState.WRITER_IDLE)) {
            sendKeepAlive();
        }else
            if ((e.state()) == (io.netty.handler.timeout.IdleState.READER_IDLE)) {
                clientTimeout();
            }
        
    }
}