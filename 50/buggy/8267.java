public void stopPeripheral() {
    if ((mGattServer) != null) {
        disconnectFromDevices();
        mGattServer.close();
    }
    mBleAdvertising.stopAdvertising();
}