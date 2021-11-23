@java.lang.Override
public void channelActive(io.netty.channel.Channel channel) {
    setChannel(channel);
    synchronized(notifyConnected) {
        notifyConnected.notifyAll();
    }
    super.channelActive(channel);
}