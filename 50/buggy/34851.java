@java.lang.Override
public java.lang.Object decode(io.netty.buffer.ByteBuf buf, org.redisson.client.handler.State state) {
    java.lang.String status = buf.toString(CharsetUtil.UTF_8);
    buf.skipBytes(2);
    return status;
}