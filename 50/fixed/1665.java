@java.lang.Override
public com.mooshim.mooshimeter.common.MeterReading getOffset(com.mooshim.mooshimeter.devices.Channel c) {
    return wrapMeterReading(c, offsets.get(c), true);
}