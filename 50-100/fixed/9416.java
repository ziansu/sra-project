private boolean addToLocalActiveView(java.net.InetAddress peer) {
    if (localDatacenterView.contains(peer))
        return false;
    
    localDatacenterView.addLast(peer);
    if ((localDatacenterView.size()) > (endpointStateSubscriber.fanout(datacenter, datacenter)))
        expungeNode(localDatacenterView.removeFirst(), datacenter);
    
    return true;
}