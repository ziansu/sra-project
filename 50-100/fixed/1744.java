private org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress getPublicIP(org.opendaylight.yang.gen.v1.urn.opendaylight.faas.logical.faas.logical.routers.rev151013.logical.routers.container.logical.routers.LogicalRouter lr, org.opendaylight.faas.uln.cache.UserLogicalNetworkCache uln) {
    java.util.List<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress> ips = new java.util.ArrayList<>();
    for (org.opendaylight.yang.gen.v1.urn.opendaylight.faas.logical.faas.common.rev151013.Uuid p : lr.getPort()) {
        org.opendaylight.faas.uln.cache.PortMappingInfo pi = uln.getPortStore().get(p);
        ips.addAll(pi.getPort().getPublicIps());
    }
    if (!(ips.isEmpty())) {
        return ips.get(0);
    }
    return null;
}