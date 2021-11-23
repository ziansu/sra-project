@java.lang.Override
public void channelRead(io.netty.channel.ChannelHandlerContext ctx, java.lang.Object msg) {
    if (isPass) {
        return ;
    }
    if (msg instanceof io.netty.handler.codec.http.HttpRequest) {
        handleHttpRequest(ctx, ((io.netty.handler.codec.http.HttpRequest) (msg)));
    }else
        if (msg instanceof io.netty.handler.codec.http.HttpContent) {
            handleHttpContent(ctx, ((io.netty.handler.codec.http.HttpContent) (msg)));
        }
    
}