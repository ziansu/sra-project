private void onOpenConfigRemoved(final org.opendaylight.yangtools.yang.binding.DataObject removedData) {
    if (removedData instanceof org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.top.bgp.Global) {
        ribImplProvider.onGlobalRemoved(((org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.top.bgp.Global) (removedData)));
    }else
        if (removedData instanceof org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.top.bgp.Neighbors) {
            final java.util.List<org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.neighbors.Neighbor> neighbors = ((org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.top.bgp.Neighbors) (removedData)).getNeighbor();
            if (neighbors != null) {
                for (final org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.rev151009.bgp.neighbors.Neighbor neighbor : neighbors) {
                    removeNeighbor(neighbor);
                }
            }
        }else {
            org.opendaylight.protocol.bgp.openconfig.impl.moduleconfig.BGPOpenConfigListener.LOG.info("Skipping unhandled removed data: {}", removedData);
        }
    
}