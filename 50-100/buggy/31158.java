@org.junit.Test
public void EventElectric() {
    org.openhab.binding.zwave.internal.converter.ZWaveMeterTblMonitorConverter converter = new org.openhab.binding.zwave.internal.converter.ZWaveMeterTblMonitorConverter();
    org.openhab.binding.zwave.handler.ZWaveThingChannel channel = createChannel(MeterTblMonitorScale.TE_KWh.toString());
    java.math.BigDecimal value = new java.math.BigDecimal("3.3");
    org.openhab.binding.zwave.internal.protocol.event.ZWaveCommandClassValueEvent event = createEvent(ZWaveMeterTblMonitorCommandClass.MeterTblMonitorType.TWIN_ELECTRIC, ZWaveMeterTblMonitorCommandClass.MeterTblMonitorScale.TE_KWh, value);
    org.eclipse.smarthome.core.types.State state = converter.handleEvent(channel, event);
    org.junit.Assert.assertEquals(state.getClass(), org.eclipse.smarthome.core.library.types.DecimalType.class);
    org.junit.Assert.assertEquals(((org.eclipse.smarthome.core.library.types.DecimalType) (state)).toBigDecimal(), value);
}