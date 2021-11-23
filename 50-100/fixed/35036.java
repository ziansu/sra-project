@com.google.common.annotations.VisibleForTesting
boolean shouldSendNeighborRequest(java.lang.String datacenter) {
    if (localDatacenterView.isEmpty())
        return true;
    
    return datacenter.equals(this.datacenter) ? (endpointStateSubscriber.fanout(datacenter, datacenter)) > (localDatacenterView.size()) : (endpointStateSubscriber.comapreDatacenterSizes(this.datacenter, datacenter)) <= 0;
}