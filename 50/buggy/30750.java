public io.netty.channel.group.ChannelGroup getChannels() {
    try {
        countDownLatch.await();
    } catch (java.lang.InterruptedException ignored) {
        com.hazelcast.simulator.utils.EmptyStatement.ignore(ignored);
    }
    return channels;
}