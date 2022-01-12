private boolean addToLocalActiveView(java.net.InetAddress peer) {
    if (localDatacenterView.contains(peer))
        return false;
    
    localDatacenterView.addLast(peer);
    org.apache.cassandra.gossip.hyparview.HyParViewService.logger.info(java.lang.String.format("%s adding %s to local active view", localAddress, peer));
    if ((localDatacenterView.size()) > (endpointStateSubscriber.fanout(datacenter, datacenter)))
        expungeNode(localDatacenterView.removeFirst(), datacenter);
    
    return true;
}