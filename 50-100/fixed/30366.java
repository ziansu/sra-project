private static boolean isNew(java.util.SortedSet<net.tomp2p.peers.PeerAddress> queueToAsk, net.tomp2p.peers.PeerAddress item) {
    if (queueToAsk.contains(item)) {
        return false;
    }
    java.util.SortedSet<net.tomp2p.peers.PeerAddress> tmp = queueToAsk.headSet(item);
    return (tmp.size()) == 0;
}