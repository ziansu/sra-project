private org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowRemoved buildMessage(boolean isV10) {
    org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.protocol.rev130731.FlowRemovedMessageBuilder builder = new org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.protocol.rev130731.FlowRemovedMessageBuilder().setCookie(java.math.BigInteger.ONE).setPriority(1).setTableId(new org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.common.types.rev130731.TableId(42L));
    if (isV10) {
        builder.setMatchV10(new org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.oxm.rev150225.match.v10.grouping.MatchV10Builder().setWildcards(flowWildcards).build());
    }else {
        builder.setMatch(new org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.oxm.rev150225.match.grouping.MatchBuilder().setMatchEntry(java.util.Collections.<org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.oxm.rev150225.match.entries.grouping.MatchEntry>emptyList()).build());
    }
    return builder.build();
}