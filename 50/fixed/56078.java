@java.lang.Override
public void exceptionCaught(com.lmx.xcall.client.ChannelHandlerContext ctx, java.lang.Throwable cause) throws java.lang.Exception {
    ctx.close();
}