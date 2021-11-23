@java.lang.Override
protected void initChannel(io.netty.channel.socket.SocketChannel ch) throws java.lang.Exception {
    ch.pipeline().addLast(new io.netty.handler.codec.http.HttpServerCodec(200, 200, 1024), new io.netty.handler.codec.http.HttpObjectAggregator(1024, true), new cc.blynk.server.api.http.handlers.HttpHandler(holder.userDao, holder.sessionDao, holder.stats));
}