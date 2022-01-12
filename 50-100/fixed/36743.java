@java.lang.Override
protected void channelRead0(io.netty.channel.ChannelHandlerContext ctx, io.netty.buffer.ByteBuf msg) throws java.lang.Exception {
    rawBuffer.writeBytes(msg, 0, msg.readableBytes());
    com.github.dockerjava.api.model.Frame frame = null;
    do {
        frame = decode();
        if (frame != null) {
            resultCallback.onNext(frame);
        }
    } while (frame != null );
}