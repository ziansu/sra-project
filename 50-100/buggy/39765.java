public boolean connect() {
    boolean connected = false;
    if (!(this.isOpened())) {
        try {
            connected = this.openPort();
            this.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            this.setFlowControlMode(((jssc.SerialPort.FLOWCONTROL_RTSCTS_IN) | (jssc.SerialPort.FLOWCONTROL_RTSCTS_OUT)));
        } catch (jssc.SerialPortException e1) {
            e1.printStackTrace();
        }
    }
    return connected;
}