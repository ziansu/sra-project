@javafx.fxml.FXML
public void mooringRequestedOutgoing(javafx.event.ActionEvent event) {
    java.lang.String boatName = idListView.getSelectionModel().getSelectedItem();
    java.lang.String vesselId = portCallTable.get(boatName).getVesselId();
    java.lang.String timestamp = dateFormat.format(new java.util.Date());
    se.viktoria.stm.portcdm.connector.common.util.StateWrapper wrapperService = new se.viktoria.stm.portcdm.connector.common.util.StateWrapper(eu.portcdm.messaging.ServiceObject.DEPARTURE_MOORING_OPERATION, eu.portcdm.messaging.ServiceTimeSequence.REQUESTED, eu.portcdm.messaging.LogicalLocation.BERTH);
    eu.portcdm.messaging.PortCallMessage pcmService = portcdmApi.portCallMessageFromStateWrapper(vesselId, wrapperService, timestamp, TimeType.ESTIMATED);
    portcdmApi.sendPortCallMessage(pcmService);
}