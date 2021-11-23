public synchronized com.shuffle.p2p.WebsocketServerChannel.WebsocketPeer get(java.net.InetAddress identity) {
    com.shuffle.p2p.WebsocketServerChannel.WebsocketPeer peer = peers.get(identity);
    if (peer == null) {
        peer = peers.put(identity, new com.shuffle.p2p.WebsocketServerChannel.WebsocketPeer(identity));
    }
    return peer;
}