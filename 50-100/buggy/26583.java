public void disconnect() throws jssc.SerialPortException {
    setConnected(false);
    serialReader = null;
    if ((serialPort) != null) {
        serialPort.removeEventListener();
        serialPort.closePort();
        serialPort = null;
        try {
            java.lang.Thread.sleep(50);
        } catch (java.lang.InterruptedException e) {
        }
    }
    org.energy_home.jemma.javagal.layers.data.implementations.SerialPortConnectorJssc.LOG.info("RS232 - Disconnected");
}