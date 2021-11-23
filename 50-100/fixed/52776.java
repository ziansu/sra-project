public <T extends com.serotonin.bacnet4j.service.acknowledgement.AcknowledgementService> void send(com.serotonin.bacnet4j.type.constructed.Address address, com.serotonin.bacnet4j.service.confirmed.ConfirmedRequestService serviceRequest, com.serotonin.bacnet4j.ResponseConsumer consumer) {
    com.serotonin.bacnet4j.RemoteDevice d = getRemoteDevice(address);
    if (d == null)
        transport.send(address, MaxApduLength.UP_TO_50.getMaxLength(), Segmentation.noSegmentation, serviceRequest, consumer);
    else
        send(d, serviceRequest, consumer);
    
}