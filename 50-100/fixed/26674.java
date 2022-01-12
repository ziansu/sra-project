@java.lang.Override
public void sendBinary(java.nio.ByteBuffer partialByte, boolean isLast) throws java.io.IOException {
    io.netty.buffer.ByteBuf partialByteBuf = io.netty.buffer.Unpooled.wrappedBuffer(partialByte);
    ctx.channel().write(new io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame(isLast, 0, partialByteBuf));
    ctx.channel().flush();
}