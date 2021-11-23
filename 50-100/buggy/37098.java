public com.google.common.base.Optional<org.openrepose.core.filter.Node> getLocalNode(org.openrepose.core.filter.SystemModel systemModel) {
    com.google.common.base.Optional<org.openrepose.core.filter.Node> localNode = com.google.common.base.Optional.absent();
    for (org.openrepose.core.filter.Cluster reposeCluster : systemModel.getReposeCluster()) {
        if (reposeCluster.getId().equals(clusterId)) {
            for (org.openrepose.core.filter.Node node : reposeCluster.getNodes().getNode()) {
                if (node.getId().equals(nodeId)) {
                    localNode = com.google.common.base.Optional.of(node);
                }
            }
        }
    }
    return localNode;
}