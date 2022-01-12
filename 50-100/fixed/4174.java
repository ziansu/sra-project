public static org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action createActionPushMpls(int order) {
    org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.mpls.action._case.PushMplsActionBuilder push = new org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.mpls.action._case.PushMplsActionBuilder();
    push.setEthernetType(org.opendaylight.sfc.util.openflow.SfcOpenflowUtils.ETHERTYPE_MPLS_UCAST);
    org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.PushMplsActionCaseBuilder pushMplsCase = new org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.PushMplsActionCaseBuilder();
    pushMplsCase.setPushMplsAction(push.build());
    org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.ActionBuilder ab = org.opendaylight.sfc.util.openflow.SfcOpenflowUtils.createActionBuilder(order);
    ab.setAction(pushMplsCase.build());
    return ab.build();
}