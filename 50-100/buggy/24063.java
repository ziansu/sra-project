@java.lang.Override
public void write(io.netty.channel.ChannelHandlerContext ctx, java.lang.Object msg, io.netty.channel.ChannelPromise promise) throws java.lang.Exception {
    if (compression.isEnabled()) {
        if (msg instanceof io.netty.buffer.ByteBuf) {
            offerByteBuf(ctx, msg, promise);
        }else
            if (msg instanceof io.netty.handler.codec.http.HttpMessage) {
                offerHttpMessage(msg, promise);
            }
        
    }else {
        super.write(ctx, msg, promise);
    }
}