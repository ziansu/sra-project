void publishNetworks(org.jclouds.compute.domain.NodeMetadata node, org.apache.brooklyn.api.entity.Entity entity) {
    if ((entity.sensors().get(org.apache.brooklyn.location.jclouds.PRIVATE_ADDRESSES)) == null) {
        entity.sensors().set(org.apache.brooklyn.location.jclouds.PRIVATE_ADDRESSES, com.google.common.collect.ImmutableSet.copyOf(node.getPrivateAddresses()));
    }
    if ((entity.sensors().get(org.apache.brooklyn.location.jclouds.PUBLIC_ADDRESSES)) == null) {
        entity.sensors().set(org.apache.brooklyn.location.jclouds.PUBLIC_ADDRESSES, com.google.common.collect.ImmutableSet.copyOf(node.getPublicAddresses()));
    }
}