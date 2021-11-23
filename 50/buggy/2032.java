public void handleDeCoupleMbusDeviceResponse(final com.alliander.osgp.shared.infra.jms.DeviceMessageMetadata deviceMessageMetadata, final com.alliander.osgp.dto.valueobjects.smartmetering.DecoupleMbusDto decoupleMbusResponseDto) throws com.alliander.osgp.shared.exceptionhandling.FunctionalException {
    final java.lang.String deviceIdentification = deviceMessageMetadata.getDeviceIdentification();
    final com.alliander.osgp.domain.core.entities.SmartMeter gatewayDevice = this.domainHelperService.findSmartMeter(deviceIdentification);
    this.doDeCoupleMBusDevice(gatewayDevice, decoupleMbusResponseDto);
}