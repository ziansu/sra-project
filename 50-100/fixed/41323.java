public synchronized void remove(org.semux.net.Channel ch) {
    org.semux.net.ChannelManager.logger.debug("Channel removed: remoteAddress = {}:{}", ch.getRemoteIp(), ch.getRemotePort());
    java.lang.System.out.println(channels);
    channels.remove(ch.getRemoteAddress());
    if (ch.isActive()) {
        activeChannels.remove(ch.getRemotePeer().getPeerId());
        ch.onDisconnect();
    }
}