@java.lang.Override
protected io.netty.channel.ChannelOutboundBuffer.ThreadLocalPooledByteBuf newObject(io.netty.util.Recycler.Handle handle) {
    return new io.netty.channel.ChannelOutboundBuffer.ThreadLocalPooledByteBuf(handle);
}