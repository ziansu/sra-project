private void doDeCoupleMBusDevice(final com.alliander.osgp.dto.valueobjects.smartmetering.DecoupleMbusDto decoupleMbusResponseDto) throws com.alliander.osgp.shared.exceptionhandling.FunctionalException {
    final java.lang.String mbusDeviceIdentification = decoupleMbusResponseDto.getmBusDeviceIdentification();
    final com.alliander.osgp.domain.core.entities.SmartMeter mbusDevice = this.domainHelperService.findSmartMeter(mbusDeviceIdentification);
    mbusDevice.setChannel(null);
    mbusDevice.setMbusPrimaryAddress(null);
    mbusDevice.updateGatewayDevice(null);
    this.smartMeteringDeviceRepository.save(mbusDevice);
}