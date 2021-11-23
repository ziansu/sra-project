private void closePort() {
    synchronized(portLock) {
        org.openhab.binding.dsmr.internal.DSMRPort.logger.info("Closing DSMR port");
        isOpen = false;
        if ((reader) != null) {
            try {
                reader.close();
            } catch (java.io.IOException ioe) {
                org.openhab.binding.dsmr.internal.DSMRPort.logger.debug("Failed to close reader", ioe);
            }
        }
        if ((serialPort) != null) {
            serialPort.close();
        }
        reader = null;
        serialPort = null;
    }
}