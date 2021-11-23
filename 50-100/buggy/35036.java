@com.google.common.annotations.VisibleForTesting
boolean shouldSendNeighborRequest(java.lang.String datacenter) {
    return datacenter.equals(this.datacenter) ? (endpointStateSubscriber.fanout(datacenter, datacenter)) > (localDatacenterView.size()) : (endpointStateSubscriber.comapreDatacenterSizes(this.datacenter, datacenter)) <= 0;
}