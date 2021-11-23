public void close() {
    if ((mGattServer) != null) {
        disconnectFromDevices();
        mGattServer.close();
    }
    mBleAdvertising.stopAdvertising();
}