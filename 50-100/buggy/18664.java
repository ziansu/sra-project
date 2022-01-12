private org.easymock.Capture<java.lang.Throwable> catchHandlerExceptions(io.netty.channel.ChannelInboundHandler handler) throws java.lang.Exception {
    org.easymock.Capture<java.lang.Throwable> throwable = new org.easymock.Capture<java.lang.Throwable>();
    handler.exceptionCaught(org.easymock.EasyMock.anyObject(io.netty.channel.ChannelHandlerContext.class), org.easymock.EasyMock.capture(throwable));
    org.easymock.EasyMock.expectLastCall().anyTimes();
    return throwable;
}