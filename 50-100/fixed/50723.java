public void close() {
    if ((serialPort) != null) {
        try {
            if ((transport) != null) {
                transport.close();
            }
            if ((inputStream) != null) {
                inputStream.close();
            }
        } catch (java.io.IOException e) {
            com.ghgande.j2mod.modbus.net.SerialConnection.logger.debug(e.getMessage());
        } finally {
            serialPort.closePort();
        }
    }
    serialPort = null;
}