public void channelWritabilityChanged(io.netty.channel.Channel c) {
    io.netty.channel.Channel channel = channels.get(c.id());
    if (checkChannel(channel)) {
        channel.notifyAll();
    }
}