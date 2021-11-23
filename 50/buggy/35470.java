private void connect() {
    mBluetoothLe.setRetryConnectEnable(false).startConnect(false, mBluetoothDevice);
}