public static com.noctarius.tengi.buffer.MemoryBuffer create(io.netty.buffer.ByteBuf buffer) {
    return new com.noctarius.tengi.buffer.impl.NettyMemoryBuffer().setByteBuf(buffer);
}