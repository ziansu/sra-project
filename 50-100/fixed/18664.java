private static org.easymock.Capture<java.lang.Throwable> catchHandlerExceptions(io.netty.channel.ChannelInboundHandler handler) throws java.lang.Exception {
    org.easymock.Capture<java.lang.Throwable> throwable = new org.easymock.Capture<java.lang.Throwable>();
    handler.exceptionCaught(anyObject(io.netty.channel.ChannelHandlerContext.class), capture(throwable));
    expectLastCall().anyTimes();
    return throwable;
}