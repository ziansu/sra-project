void publishNetworks(org.jclouds.compute.domain.NodeMetadata node, org.apache.brooklyn.api.entity.Entity entity) {
    entity.sensors().set(org.apache.brooklyn.location.jclouds.PRIVATE_ADDRESSES, com.google.common.collect.ImmutableSet.copyOf(node.getPrivateAddresses()));
    entity.sensors().set(org.apache.brooklyn.location.jclouds.PUBLIC_ADDRESSES, com.google.common.collect.ImmutableSet.copyOf(node.getPublicAddresses()));
}