@java.lang.Override
public synchronized void run() {
    try {
        PortCommunicator.serialPort.openPort();
        PortCommunicator.serialPort.setParams(9600, 8, 1, 0);
        int mask = SerialPort.MASK_RXCHAR;
        PortCommunicator.serialPort.setEventsMask(mask);
        PortCommunicator.serialPort.addEventListener(new SerialPortReader());
        PortCommunicator.moveDome(PortCommunicator.mCommand, PortCommunicator.mAllTheWay);
        PortCommunicator.serialPort.closePort();
    } catch (SerialPortException e) {
        e.printStackTrace();
    }
}