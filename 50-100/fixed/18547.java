private void writeIfPossible() {
    while ((_buffer.readableBytes()) > 0) {
        final int bytesWritten = _buffer.readableBytes();
        io.netty.handler.codec.http.HttpContent content = new io.netty.handler.codec.http.DefaultHttpContent(_buffer);
        _ctx.writeAndFlush(content).addListener(new io.netty.channel.ChannelFutureListener() {
            @java.lang.Override
            public void operationComplete(io.netty.channel.ChannelFuture future) throws java.lang.Exception {
                _readHandle.request(1);
            }
        });
        _buffer = io.netty.buffer.Unpooled.compositeBuffer(1024);
    } 
}