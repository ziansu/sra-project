private boolean isMbusDeviceCoupled(final com.alliander.osgp.domain.core.entities.SmartMeter mbusDevice) {
    return (mbusDevice.getChannel()) == null;
}