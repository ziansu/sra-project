public void disconnect() {
    if (isCentral()) {
        stopBrowsing();
        if (((this.mDiscoveredPeripherals) != null) && (!(this.mDiscoveredPeripherals.isEmpty()))) {
            for (com.nclab.ncmultipeerconnectivity.NCMCPeripheralInfo info : this.mDiscoveredPeripherals.values()) {
                disconnectToPeripheralByInfo(info);
            }
        }
    }else {
        stopAdvertising();
        if ((this.mBluetoothGattServer) != null) {
            this.mBluetoothGattServer.clearServices();
        }
    }
}