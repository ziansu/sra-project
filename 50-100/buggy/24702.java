private void cacheEdgeForItsPort(org.opendaylight.yang.gen.v1.urn.opendaylight.faas.logical.faas.edges.rev151013.edges.container.edges.Edge edge, org.opendaylight.faas.uln.cache.UserLogicalNetworkCache uln) {
    org.opendaylight.faas.uln.cache.PortMappingInfo leftPort = uln.findLeftPortOnEdge(edge);
    org.opendaylight.faas.uln.cache.PortMappingInfo rightPort = uln.findRightPortOnEdge(edge);
    uln.addLrLswEdgeToPort(leftPort.getPort(), edge);
    uln.addLrLswEdgeToPort(rightPort.getPort(), edge);
}