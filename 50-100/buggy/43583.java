@java.lang.Override
protected void decode(io.netty.channel.ChannelHandlerContext ctx, io.netty.buffer.ByteBuf in, java.util.List<java.lang.Object> out) throws java.lang.Exception {
    byte[] bytes;
    if (in.hasArray()) {
        bytes = in.array();
    }else {
        bytes = new byte[in.readableBytes()];
        in.getBytes(in.readerIndex(), bytes);
    }
    try {
        out.add(serializer.deserialize(bytes));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}