public void writeCommand(java.lang.String command) {
    if ((nl.tudelft.lab.lettx.dao.SerialPortCommDao.serialPort) == null) {
        openSerialPort();
    }
    try {
        nl.tudelft.lab.lettx.dao.SerialPortCommDao.serialPort.writeBytes(command.getBytes());
    } catch (nl.tudelft.lab.lettx.dao.SerialPortException e) {
        e.printStackTrace();
    }
}