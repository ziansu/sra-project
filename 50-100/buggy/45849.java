@java.lang.Override
public synchronized void run() {
    try {
        PortCommunicator.serialPort.openPort();
        java.lang.System.out.println("Port Opened");
        PortCommunicator.serialPort.setParams(9600, 8, 1, 0);
        int mask = SerialPort.MASK_RXCHAR;
        PortCommunicator.serialPort.setEventsMask(mask);
        PortCommunicator.serialPort.addEventListener(new SerialPortReader());
        java.lang.System.out.println("Mask and SerialPortReader added");
        PortCommunicator.moveDome(PortCommunicator.mCommand, PortCommunicator.mAllTheWay);
        java.lang.System.out.println("moveDome finished");
        PortCommunicator.serialPort.closePort();
        java.lang.System.out.println("Port Closed");
    } catch (SerialPortException e) {
        e.printStackTrace();
    }
}