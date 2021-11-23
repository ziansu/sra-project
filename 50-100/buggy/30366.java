static boolean isNew(java.util.SortedSet<net.tomp2p.peers.PeerAddress> queueToAsk, net.tomp2p.peers.PeerAddress first) {
    if (queueToAsk.contains(first))
        return false;
    
    java.util.SortedSet<net.tomp2p.peers.PeerAddress> tmp = queueToAsk.headSet(first);
    return (tmp.size()) == 0;
}