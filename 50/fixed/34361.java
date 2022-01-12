private void applyOffer(com.ebay.myriad.scheduler.NMStore.NodeWrapper nodeWrapper, com.ebay.myriad.scheduler.OfferLifecycleManager.OfferWrapper offerWrapper) {
    org.apache.hadoop.yarn.server.resourcemanager.rmnode.RMNode rmNode = nodeWrapper.getNode().getRMNode();
    nodeWrapper.snapshotContainers();
    updateRMNodeCapacity(rmNode, offerWrapper, com.ebay.myriad.scheduler.YarnNodeCapacityManager.APPLY_OFFER);
    offerWrapper.markApplied();
}