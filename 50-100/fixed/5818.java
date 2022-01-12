public static org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action createActionPktIn(final int pktLength, final int order) {
    org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputActionBuilder output = new org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputActionBuilder();
    output.setMaxLength(65535);
    org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri controllerPort = new org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri(OutputPortValues.CONTROLLER.toString());
    output.setOutputNodeConnector(controllerPort);
    org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.ActionBuilder ab = org.opendaylight.sfc.util.openflow.SfcOpenflowUtils.createActionBuilder(order);
    ab.setAction(new org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.OutputActionCaseBuilder().setOutputAction(output.build()).build());
    return ab.build();
}