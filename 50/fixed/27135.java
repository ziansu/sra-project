public java.util.Date getTimestamp(net.sharkfw.knowledgeBase.PeerSemanticTag peer) {
    net.sharkfw.knowledgeBase.sync.TimestampList.PeerTimestamp p = findPeerTimestamp(peer);
    if (p == null)
        return new java.util.Date(0);
    else
        return p.getDate();
    
}