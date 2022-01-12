private void addMissingWorkerNodes() {
    for (java.lang.Object logicalIdObj : query.getLogicalNodeIds()) {
        for (java.lang.Object physicalIdObj : query.getPhysicalNodeIds(((java.lang.Integer) (logicalIdObj)))) {
            java.net.InetAddress physAddr = query.getNodeAddress(((java.lang.Integer) (physicalIdObj)));
            if (!(netTopology.containsKey(physAddr))) {
                netTopology.put(new uk.ac.imperial.lsds.seep.manet.GraphUtil.InetAddressNodeId(physAddr), new java.util.HashMap<uk.ac.imperial.lsds.seep.manet.GraphUtil.InetAddressNodeId, java.lang.Double>());
            }
        }
    }
    uk.ac.imperial.lsds.seep.manet.ShortestPathRouter.logger.debug("TODO: What if the logical query is wrong!");
}