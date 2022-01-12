@java.lang.Override
protected void decode(io.netty.channel.ChannelHandlerContext ctx, io.netty.buffer.ByteBuf msg, java.util.List<java.lang.Object> out) throws java.lang.Exception {
    byte[] bytes;
    if (msg.hasArray()) {
        bytes = msg.array();
    }else {
        bytes = new byte[msg.readableBytes()];
        msg.getBytes(msg.readerIndex(), bytes);
    }
    try {
        out.add(serializer.deserialize(bytes));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}