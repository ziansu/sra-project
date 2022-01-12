public void channelWritabilityChanged(io.netty.channel.Channel c) {
    io.netty.channel.Channel channel = channels.get(c.id());
    synchronized(channel) {
        if (checkChannel(channel)) {
            channel.notifyAll();
        }
    }
}