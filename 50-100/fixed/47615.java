@java.lang.Override
protected hivemall.mix.yarn.network.Heartbeat decode(io.netty.channel.ChannelHandlerContext ctx, io.netty.buffer.ByteBuf in) throws java.lang.Exception {
    final io.netty.buffer.ByteBuf frame = ((io.netty.buffer.ByteBuf) (super.decode(ctx, in)));
    if (frame == null) {
        return null;
    }
    java.lang.String containerId = hivemall.mix.yarn.network.NettyUtils.readString(frame);
    java.lang.String host = hivemall.mix.yarn.network.NettyUtils.readString(frame);
    int port = frame.readInt();
    return new hivemall.mix.yarn.network.Heartbeat(containerId, host, port);
}