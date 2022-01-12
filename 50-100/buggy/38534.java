public void handleDeCoupleMbusDeviceResponse(final com.alliander.osgp.shared.infra.jms.DeviceMessageMetadata deviceMessageMetadata, final com.alliander.osgp.shared.infra.jms.ResponseMessageResultType result, final com.alliander.osgp.shared.exceptionhandling.OsgpException exception, final com.alliander.osgp.dto.valueobjects.smartmetering.DecoupleMbusDto decoupleMbusResponseDto) throws com.alliander.osgp.shared.exceptionhandling.FunctionalException {
    if (exception == null) {
        this.mBusGatewayService.handleDeCoupleMbusDeviceResponse(deviceMessageMetadata, decoupleMbusResponseDto);
    }
    this.handleResponse("decoupleMbusDevice", deviceMessageMetadata, result, exception);
}