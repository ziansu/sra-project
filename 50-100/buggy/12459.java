private void cubeConfigReset() {
    logger.info("Resetting configuration for MAX! Cube {}", org.openhab.binding.max.internal.handler.MaxCubeBridgeHandler.getThing().getUID());
    sendCubeCommand(new org.openhab.binding.max.internal.command.A_Command());
    for (org.openhab.binding.max.internal.device.Device di : devices) {
        for (org.openhab.binding.max.internal.handler.DeviceStatusListener deviceStatusListener : deviceStatusListeners) {
            try {
                deviceStatusListener.onDeviceRemoved(this, di);
            } catch (java.lang.Exception e) {
                logger.error("An exception occurred while calling the DeviceStatusListener", e);
                unregisterDeviceStatusListener(deviceStatusListener);
            }
        }
    }
    clearDeviceList();
    propertiesSet = false;
    roomPropertiesSet = false;
}