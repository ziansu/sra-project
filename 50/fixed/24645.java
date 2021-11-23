private tonivade.redis.protocol.SafeString readBytes(io.netty.buffer.ByteBuf buffer, int size) {
    return new tonivade.redis.protocol.SafeString(buffer.readBytes(size).nioBuffer());
}