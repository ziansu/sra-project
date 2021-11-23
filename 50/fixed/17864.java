public void addPeer(com.networking.model.Peer peer) {
    synchronized(peers) {
        peers.add(peer);
    }
    peer.start();
}