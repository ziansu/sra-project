public static java.lang.String buildVxlanGpePortKey(final org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress remote) {
    return ("vxlanGpeTun" + "_") + (remote.getIpv4Address().getValue());
}