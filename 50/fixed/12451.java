public static boolean firstTime() {
    return (!(net.arccotangent.pacchat.net.p2p.PeerManager.peerFile.exists())) && ((net.arccotangent.pacchat.net.p2p.PeerManager.peerFile.length()) != 0);
}