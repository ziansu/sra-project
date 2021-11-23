@org.springframework.ws.server.endpoint.annotation.PayloadRoot(localPart = "PeriodicMeterReadsAsyncRequest", namespace = com.alliander.osgp.adapter.ws.smartmetering.endpoints.SmartMeteringMonitoringEndpoint.SMARTMETER_MONITORING_NAMESPACE)
@org.springframework.ws.server.endpoint.annotation.ResponsePayload
public com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.PeriodicMeterReadsResponse getPeriodicMeterReadsResponse(@com.alliander.osgp.adapter.ws.endpointinterceptors.OrganisationIdentification
final java.lang.String organisationIdentification, @org.springframework.ws.server.endpoint.annotation.RequestPayload
final com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.PeriodicMeterReadsAsyncRequest request) throws com.alliander.osgp.shared.exceptionhandling.OsgpException {
    com.alliander.osgp.adapter.ws.smartmetering.endpoints.SmartMeteringMonitoringEndpoint.LOGGER.debug("Incoming PeriodicMeterReadsAsyncRequest for meter: {}.", request.getDeviceIdentification());
    try {
        final com.alliander.osgp.adapter.ws.smartmetering.domain.entities.MeterResponseData meterResponseData = this.monitoringService.dequeuePeriodicMeterReadsResponse(request.getCorrelationUid());
        final com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.PeriodicMeterReadsResponse response = this.monitoringMapper.map(meterResponseData.getMessageData(), com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.PeriodicMeterReadsResponse.class);
        return response;
    } catch (final java.lang.Exception e) {
        throw this.handleRetrieveException(e, request, organisationIdentification);
    }
}