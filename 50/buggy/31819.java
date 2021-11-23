@java.lang.Override
protected void addToNetworkDriver(org.doggateway.drivers.bluetooth.ble.network.info.BLEDeviceRegistration bleDevReg) {
    this.network.addDeviceRegistration(bleDevReg);
    this.enableCharacteristicsNotification();
}