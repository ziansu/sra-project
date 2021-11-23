@java.lang.Override
public void write(final io.netty.channel.ChannelHandlerContext ctx, java.lang.Object msg, io.netty.channel.ChannelPromise promise) throws java.lang.Exception {
    pendingUnencryptedWrites.add(io.netty.util.internal.PendingWrite.newInstance(msg, promise));
}