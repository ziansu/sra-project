@java.lang.Override
protected void initChannel(final io.netty.channel.socket.SocketChannel ch) throws java.lang.Exception {
    final io.netty.channel.ChannelPipeline pipeline = ch.pipeline();
    pipeline.addLast("decoder", new io.netty.handler.codec.http.HttpRequestDecoder()).addLast("aggregator", new io.netty.handler.codec.http.HttpObjectAggregator(1048576)).addLast("processor", new ru.shishmakov.server.HttpServerProcessorHandler()).addLast("encoder", new io.netty.handler.codec.http.HttpResponseEncoder());
}