public java.util.Date getTimestamp(net.sharkfw.knowledgeBase.PeerSemanticTag peer) {
    net.sharkfw.knowledgeBase.sync.TimestampList.PeerTimestamp p = findPeerTimestamp(peer);
    if (p == null)
        return null;
    else
        return p.getDate();
    
}