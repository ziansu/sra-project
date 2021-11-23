@java.lang.Override
public void channelActive(io.netty.channel.Channel channel) {
    super.channelActive(channel);
    setChannel(channel);
    synchronized(notifyConnected) {
        notifyConnected.notifyAll();
    }
}