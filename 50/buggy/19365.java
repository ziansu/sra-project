public static void addMatchInPort(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.MatchBuilder match, java.lang.String nodeName, int value) {
    match.setInPort(new org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId(((nodeName + ":") + (java.lang.String.valueOf(value)))));
}