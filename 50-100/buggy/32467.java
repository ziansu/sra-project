@java.lang.Override
public void operationComplete(io.netty.channel.ChannelFuture future) throws java.lang.Exception {
    if (future.isSuccess()) {
        java.lang.System.out.println(("Connected to instance " + (instance)));
        inboundChannel.read();
    }else {
        java.lang.System.out.println(("Something went wrong trying to connect to instance " + (instance)));
        instance = null;
        inboundChannel.close();
    }
}