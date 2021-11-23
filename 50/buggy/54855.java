@java.lang.Override
public net.solarnetwork.node.hw.deson.meter.SDMData doWithConnection(net.solarnetwork.node.io.modbus.ModbusConnection conn) throws java.io.IOException {
    if ((sample.getControlDataTimestamp()) < 0) {
        sample.readControlData(conn);
    }
    sample.readMeterData(conn);
    return sample.getSnapshot();
}