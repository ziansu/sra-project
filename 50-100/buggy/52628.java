@java.lang.Override
protected void initChannel(io.netty.channel.socket.SocketChannel ch) throws java.lang.Exception {
    ch.pipeline().addLast("frame-decoder", new io.netty.handler.codec.LengthFieldBasedFrameDecoder(1024, 0, 2, 0, 2)).addLast("msgpack-decoder", new com.windlike.quick.decoder.MsgPackDecoder()).addLast("frame-encoder", new io.netty.handler.codec.LengthFieldPrepender(2, true)).addLast("msgpack-encoder", new com.windlike.quick.encoder.MsgPackEncoder()).addLast("client-handler", new com.windlike.quick.handler.CarClientHandler());
}