public void initializeReceiver(java.lang.String serialPort, java.lang.String password, org.openhab.binding.resolvbus.model.ResolVBUSConfig config) {
    try {
        this.config = config;
        this.password = password;
        openSerialPort();
        org.openhab.binding.resolvbus.internal.ResolVBUSSerialReceiver.logger.debug(("Connected to: " + serialPort));
        resolStreamRAW = new java.util.ArrayList<java.lang.Byte>();
    } catch (java.lang.Exception e) {
        org.openhab.binding.resolvbus.internal.ResolVBUSSerialReceiver.logger.debug(e.getMessage());
        e.printStackTrace();
    }
}