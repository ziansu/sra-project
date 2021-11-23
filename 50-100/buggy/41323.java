public synchronized void remove(org.semux.net.Channel ch) {
    org.semux.net.ChannelManager.logger.debug("Channel removed: remoteAddress = {}:{}", ch.getRemoteIp(), ch.getRemotePort());
    channels.remove(ch.getRemoteAddress());
    if (ch.isActive()) {
        activeChannels.remove(ch.getRemotePeer().getPeerId());
        ch.onDisconnect();
    }
}