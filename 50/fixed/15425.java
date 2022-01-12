public synchronized com.shuffle.p2p.WebsocketServerChannel.WebsocketPeer get(java.net.InetAddress identity) {
    com.shuffle.p2p.WebsocketServerChannel.WebsocketPeer peer = peers.get(identity);
    if (peer == null) {
        peer = new com.shuffle.p2p.WebsocketServerChannel.WebsocketPeer(identity);
        peers.put(identity, peer);
    }
    return peer;
}