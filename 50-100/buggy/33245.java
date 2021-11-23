private java.lang.String connectToDevice(java.lang.String deviceId) {
    java.lang.String deviceMAC = deviceId;
    com.birdbraintechnologies.birdblocks.bluetooth.MelodySmartConnection conn = btHelper.connectToDeviceMelodySmart(deviceMAC, this.flutterUARTSettings);
    if (conn != null) {
        com.birdbraintechnologies.birdblocks.devices.Flutter device = new com.birdbraintechnologies.birdblocks.devices.Flutter(conn);
        connectedDevices.put(deviceMAC, device);
    }
    return "";
}