void handleStateChanged(int state) {
    switch (state) {
        case android.bluetooth.BluetoothAdapter.STATE_TURNING_ON :
            setEnabled(false);
            break;
        case android.bluetooth.BluetoothAdapter.STATE_ON :
            setChecked(true);
            setEnabled(true);
            updateSearchIndex(true);
            mLocalAdapter.setScanMode(BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE);
            break;
        case android.bluetooth.BluetoothAdapter.STATE_TURNING_OFF :
            setEnabled(false);
            break;
        case android.bluetooth.BluetoothAdapter.STATE_OFF :
            setChecked(false);
            setEnabled(true);
            updateSearchIndex(false);
            break;
        default :
            setChecked(false);
            setEnabled(true);
            updateSearchIndex(false);
    }
}