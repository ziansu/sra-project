public boolean bluetoothStateOn(android.content.Intent intent) {
    int newState = mBluetoothAdapter.getState();
    if (newState == (android.bluetooth.BluetoothAdapter.STATE_ON)) {
        progress.dismiss();
        currentContext.unregisterReceiver(fragmentBr);
        return true;
    }
    return false;
}