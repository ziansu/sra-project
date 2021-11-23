@java.lang.Override
protected boolean readMeterDataInternal(net.solarnetwork.node.io.modbus.ModbusConnection conn) {
    readInputData(conn, net.solarnetwork.node.hw.deson.meter.SDM360Data.ADDR_DATA_V_L1_NEUTRAL, ((net.solarnetwork.node.hw.deson.meter.SDM360Data.ADDR_DATA_V_L1_NEUTRAL) + 79));
    readInputData(conn, net.solarnetwork.node.hw.deson.meter.SDM360Data.ADDR_DATA_V_L1_L2, 25);
    return true;
}