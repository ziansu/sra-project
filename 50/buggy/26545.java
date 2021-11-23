public void channelDisconnected(net.voidfunction.rm.common.jgroups.Channel channel) {
    reset();
    for (net.voidfunction.rm.common.jgroups.JGroupsListener listener : listeners) {
        listener.onDisconnect();
    }
}