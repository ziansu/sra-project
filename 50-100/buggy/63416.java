private org.opendaylight.yang.gen.v1.urn.opendaylight.genius.itm.rev160406.transport.zones.transport.zone.Subnets findSubnets(java.util.List<org.opendaylight.yang.gen.v1.urn.opendaylight.genius.itm.rev160406.transport.zones.transport.zone.Subnets> subnets, java.lang.String subnetIp) {
    org.opendaylight.yang.gen.v1.urn.opendaylight.genius.itm.rev160406.transport.zones.transport.zone.Subnets retSubnet = null;
    for (org.opendaylight.yang.gen.v1.urn.opendaylight.genius.itm.rev160406.transport.zones.transport.zone.Subnets subnet : subnets) {
        org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix subnetPrefix = new org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix(subnetIp.toCharArray());
        if (subnet.getPrefix().equals(subnetPrefix)) {
            retSubnet = subnet;
            break;
        }
    }
    if (retSubnet == null) {
        retSubnet = newSubnets(subnetIp);
        subnets.add(retSubnet);
    }
    return retSubnet;
}