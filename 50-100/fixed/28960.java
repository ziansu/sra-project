public java.lang.String enqueueSetEncryptionKeyExchangeOnGMeterRequest(@com.alliander.osgp.domain.core.validation.Identification
final java.lang.String organisationIdentification, @com.alliander.osgp.domain.core.validation.Identification
final java.lang.String deviceIdentification) {
    com.alliander.osgp.adapter.ws.smartmetering.application.services.ConfigurationService.LOGGER.debug("enqueueSetEncryptionKeyExchangeOnGMeterRequest called with organisation {} and device {}", organisationIdentification, deviceIdentification);
    final java.lang.String correlationUid = this.correlationIdProviderService.getCorrelationId(organisationIdentification, deviceIdentification);
    final com.alliander.osgp.adapter.ws.smartmetering.infra.jms.SmartMeteringRequestMessage message = new com.alliander.osgp.adapter.ws.smartmetering.infra.jms.SmartMeteringRequestMessage(com.alliander.osgp.adapter.ws.smartmetering.infra.jms.SmartMeteringRequestMessageType.SET_ENCRYPTION_KEY_EXCHANGE_ON_G_METER, correlationUid, organisationIdentification, deviceIdentification);
    this.smartMeteringRequestMessageSender.send(message);
    return correlationUid;
}