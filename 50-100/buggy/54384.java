@java.lang.Override
protected void decode(io.netty.channel.ChannelHandlerContext ctx, io.netty.buffer.ByteBuf in, java.util.List<java.lang.Object> out) throws java.lang.Exception {
    int numRequest = in.readInt();
    java.lang.String URIs = hivemall.mix.yarn.network.NettyUtils.readString(in);
    out.add(new hivemall.mix.yarn.network.MixServerRequest(numRequest, URIs));
    in.release();
}