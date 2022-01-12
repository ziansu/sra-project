private org.openmuc.openiec61850.FcModelNode getNode(final org.openmuc.openiec61850.ServerModel serverModel, final java.lang.String objectReference, final org.openmuc.openiec61850.Fc functionalConstraint) {
    final org.openmuc.openiec61850.FcModelNode output = ((org.openmuc.openiec61850.FcModelNode) (serverModel.findModelNode(objectReference, Fc.CF)));
    if (output == null) {
        com.alliander.osgp.adapter.protocol.iec61850.infra.networking.Iec61850DeviceService.LOGGER.info("{} is null", objectReference);
    }
    return output;
}