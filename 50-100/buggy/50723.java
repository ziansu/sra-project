public void close() {
    if ((serialPort) != null) {
        try {
            transport.close();
            inputStream.close();
        } catch (java.io.IOException e) {
            com.ghgande.j2mod.modbus.net.SerialConnection.logger.debug(e.getMessage());
        } finally {
            serialPort.closePort();
        }
    }
    serialPort = null;
}