private void onOpenConfigRemoved(final org.opendaylight.yangtools.yang.binding.DataObject removedData) {
    if (removedData instanceof org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.top.bgp.Global) {
        ribImplProvider.onGlobalRemoved(((org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.top.bgp.Global) (removedData)));
    }else
        if (removedData instanceof org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.top.bgp.Neighbors) {
            final org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.top.bgp.Neighbors neighbors = ((org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.top.bgp.Neighbors) (removedData));
            for (final org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.neighbors.Neighbor neighbor : neighbors.getNeighbor()) {
                removeNeighbor(neighbor);
            }
        }else {
            org.opendaylight.protocol.bgp.openconfig.impl.moduleconfig.BGPOpenConfigListener.LOG.info("Skipping unhandled removed data: {}", removedData);
        }
    
}