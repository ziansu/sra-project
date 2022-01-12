private boolean addToRemoteActiveView(java.net.InetAddress peer, java.lang.String datacenter) {
    java.net.InetAddress existing = remoteView.get(datacenter);
    if ((existing != null) && (existing.equals(peer)))
        return false;
    
    remoteView.put(datacenter, peer);
    if (existing != null)
        expungeNode(existing, datacenter);
    
    return true;
}