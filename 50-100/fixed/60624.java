static void addPeer(java.lang.String peer) {
    net.arccotangent.pacchat.net.p2p.PeerManager.createPeerFileIfNotExist();
    if (((!(net.arccotangent.pacchat.net.p2p.PeerManager.existsInList(peer))) && (!(peer.equals("127.0.0.1")))) && (!(peer.equals(net.arccotangent.pacchat.net.NetUtils.getExternalIPAddr())))) {
        net.arccotangent.pacchat.net.p2p.PeerManager.p2p_log.i((("Adding peer " + peer) + " to database."));
        net.arccotangent.pacchat.net.p2p.PeerManager.peers.add(peer);
    }
    net.arccotangent.pacchat.net.p2p.PeerManager.updatePeerDB();
}