org.opendaylight.yangtools.yang.data.api.schema.LeafSetNode<?> getClusterList(final org.opendaylight.yangtools.yang.data.api.schema.ContainerNode attributes) {
    final com.google.common.base.Optional<org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode<?, ?>> maybeClusterList = org.opendaylight.yangtools.yang.data.api.schema.NormalizedNodes.findNode(attributes, clusterListPath);
    if (maybeClusterList.isPresent()) {
        final org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode<?, ?> clusterList = maybeClusterList.get();
        if (clusterList instanceof org.opendaylight.yangtools.yang.data.api.schema.LeafSetNode) {
            return ((org.opendaylight.yangtools.yang.data.api.schema.LeafSetNode<?>) (clusterList));
        }
        org.opendaylight.protocol.bgp.rib.impl.AttributeOperations.LOG.warn("Unexpected CLUSTER_LIST node {}, ignoring it", clusterList);
    }
    return null;
}