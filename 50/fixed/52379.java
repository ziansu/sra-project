public static void addMatchSrcIpv6(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.MatchBuilder match, java.lang.String srcIpStr, int netmask) {
    org.opendaylight.sfc.util.openflow.SfcOpenflowUtils.addMatchSrcIpv6(match, new org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv6Prefix(((srcIpStr + "/") + netmask)));
}