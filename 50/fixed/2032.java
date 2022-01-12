public void handleDeCoupleMbusDeviceResponse(final com.alliander.osgp.shared.infra.jms.DeviceMessageMetadata deviceMessageMetadata, final com.alliander.osgp.dto.valueobjects.smartmetering.DecoupleMbusDto decoupleMbusResponseDto) throws com.alliander.osgp.shared.exceptionhandling.FunctionalException {
    this.doDeCoupleMBusDevice(decoupleMbusResponseDto);
}