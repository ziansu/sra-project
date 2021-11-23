protected void setSerialPort() throws purejavacomm.UnsupportedCommOperationException {
    int baud = 9600;
    activeSerialPort.setSerialPortParams(baud, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
    activeSerialPort.setRTS(true);
    activeSerialPort.setDTR(true);
    int flow = purejavacomm.SerialPort.FLOWCONTROL_NONE;
    if (getOptionState(option1Name).equals("MERG Concentrator")) {
        jmri.jmrix.rfid.serialdriver.SerialDriverAdapter.log.debug("Set hardware flow control for Concentrator");
        flow = purejavacomm.SerialPort.FLOWCONTROL_RTSCTS_OUT;
    }
    activeSerialPort.setFlowControlMode(flow);
}