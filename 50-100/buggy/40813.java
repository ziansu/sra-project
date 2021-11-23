@java.lang.Override
public void ClientStart() {
    ts.mqttsn.XBeeAtClient.LOG.info("XBeeAT Client start");
    java.lang.String portName = this.m_properties.getProperty("portName");
    java.lang.String baudRate = this.m_properties.getProperty("baudRate");
    super.ClientStart();
    this.serialTool.openComport(portName, baudRate);
    this.initXBee();
    this.serialTool.startListerSerial(new ts.mqttsn.XBeeAtClient.SerialReader(this));
}