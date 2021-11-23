@java.lang.Override
public void channelRead(io.netty.channel.ChannelHandlerContext ctx, java.lang.Object msg) throws java.lang.Exception {
    super.channelRead(ctx, msg);
    java.lang.System.out.println("IN channelRead Metrics");
    if (msg instanceof io.netty.handler.codec.http.HttpRequest) {
        oneConnectionStat.setUri(((io.netty.handler.codec.http.HttpRequest) (msg)).getUri());
        Initializer.statisticData.updateUrlRequests(((io.netty.handler.codec.http.HttpRequest) (msg)).getUri());
    }
}