public void disconnect() {
    if (isCentral()) {
        stopBrowsing();
        for (com.nclab.ncmultipeerconnectivity.NCMCPeripheralInfo info : this.mDiscoveredPeripherals.values()) {
            disconnectToPeripheralByInfo(info);
        }
    }else {
        stopAdvertising();
        if ((this.mBluetoothGattServer) != null) {
            this.mBluetoothGattServer.clearServices();
        }
    }
}