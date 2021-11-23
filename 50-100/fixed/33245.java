private java.lang.String connectToDevice(java.lang.String deviceId) {
    com.birdbraintechnologies.birdblocks.bluetooth.MelodySmartConnection conn = btHelper.connectToDeviceMelodySmart(deviceId, this.flutterUARTSettings);
    if (conn != null) {
        com.birdbraintechnologies.birdblocks.devices.Flutter device = new com.birdbraintechnologies.birdblocks.devices.Flutter(conn);
        connectedDevices.put(deviceId, device);
    }
    return "";
}