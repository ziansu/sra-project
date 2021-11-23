@java.lang.Override
protected void initChannel(io.netty.channel.socket.SocketChannel ch) throws java.lang.Exception {
    io.netty.channel.ChannelPipeline pipeline = ch.pipeline();
    pipeline.addLast(new io.netty.handler.codec.serialization.ObjectDecoder(io.netty.handler.codec.serialization.ClassResolvers.cacheDisabled(loader)));
    pipeline.addLast(new io.netty.handler.codec.serialization.ObjectEncoder());
    pipeline.addLast(new pt.piko.libs.netty.connection.handlers.ServerHandler(this, whitelist));
}