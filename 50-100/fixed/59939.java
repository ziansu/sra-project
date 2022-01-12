@org.springframework.ws.server.endpoint.annotation.PayloadRoot(localPart = "ActualMeterReadsGasAsyncRequest", namespace = com.alliander.osgp.adapter.ws.smartmetering.endpoints.SmartMeteringMonitoringEndpoint.SMARTMETER_MONITORING_NAMESPACE)
@org.springframework.ws.server.endpoint.annotation.ResponsePayload
public com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.ActualMeterReadsGasResponse getActualMeterReadsGasResponse(@com.alliander.osgp.adapter.ws.endpointinterceptors.OrganisationIdentification
final java.lang.String organisationIdentification, @org.springframework.ws.server.endpoint.annotation.RequestPayload
final com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.ActualMeterReadsGasAsyncRequest request) throws com.alliander.osgp.shared.exceptionhandling.OsgpException {
    com.alliander.osgp.adapter.ws.smartmetering.endpoints.SmartMeteringMonitoringEndpoint.LOGGER.debug("Incoming ActualMeterReadsGasAsyncRequest for meter: {}", request.getDeviceIdentification());
    try {
        final com.alliander.osgp.adapter.ws.smartmetering.domain.entities.MeterResponseData meterResponseData = this.monitoringService.dequeueActualMeterReadsGasResponse(request.getCorrelationUid());
        return this.monitoringMapper.map(meterResponseData.getMessageData(), com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.ActualMeterReadsGasResponse.class);
    } catch (final java.lang.Exception e) {
        throw this.handleRetrieveException(e, request, organisationIdentification);
    }
}