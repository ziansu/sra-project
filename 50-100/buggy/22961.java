public void handleSetEncryptionKeyExchangeOnGMeterResponse(final java.lang.String deviceIdentification, final java.lang.String organisationIdentification, final java.lang.String correlationUid, final java.lang.String messageType, final com.alliander.osgp.shared.infra.jms.ResponseMessageResultType responseMessageResultType, final com.alliander.osgp.shared.exceptionhandling.OsgpException exception) {
    com.alliander.osgp.adapter.domain.smartmetering.application.services.ConfigurationService.LOGGER.info("handleSetEncryptionKeyExchangeOnGMeterResponse for MessageType: {}", messageType);
    com.alliander.osgp.shared.infra.jms.ResponseMessageResultType result = responseMessageResultType;
    if (exception != null) {
        com.alliander.osgp.adapter.domain.smartmetering.application.services.ConfigurationService.LOGGER.error("Set Encryption Key Exchange On G-Meter Response not ok. Unexpected Exception", exception);
        result = com.alliander.osgp.shared.infra.jms.ResponseMessageResultType.NOT_OK;
    }
    this.webServiceResponseMessageSender.send(new com.alliander.osgp.shared.infra.jms.ResponseMessage(correlationUid, organisationIdentification, deviceIdentification, result, exception, null), messageType);
}