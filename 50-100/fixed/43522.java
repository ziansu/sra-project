protected void processGroupingsReport(org.openhab.binding.zwave.internal.protocol.SerialMessage serialMessage, int offset) throws org.openhab.binding.zwave.internal.protocol.ZWaveSerialMessageException {
    maxGroups = serialMessage.getMessagePayloadByte((offset + 1));
    org.openhab.binding.zwave.internal.protocol.commandclass.ZWaveMultiAssociationCommandClass.logger.debug("NODE {} processGroupingsReport number of groups {}", getNode(), maxGroups);
    updateAssociationsNode = 1;
    configAssociations.clear();
    org.openhab.binding.zwave.internal.protocol.SerialMessage sm = getAssociationMessage(updateAssociationsNode);
    if (sm != null) {
        getController().sendData(sm);
    }
}