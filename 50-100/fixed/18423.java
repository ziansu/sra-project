public void connectIMU(java.lang.String imuDevFile) throws java.io.IOException {
    if (!(new java.io.File(imuDevFile).exists())) {
        throw new java.lang.IllegalArgumentException((("Failed to connect to IMU device (dev file not found: \"" + imuDevFile) + "\")"));
    }
    try {
        imuDev = new jssc.SerialPort(imuDevFile);
        imuDev.openPort();
        imuDev.setParams(SerialPort.BAUDRATE_57600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE, false, false);
        imuDev.addEventListener(this);
    } catch (jssc.SerialPortException oops) {
        throw new java.io.IOException("Failed to connect to IMU device", oops);
    }
}