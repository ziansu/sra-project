public void turnOnBluetooth() {
    if ((!(mBluetoothAdapter.isEnabled())) || (BluetoothAdapter.EXTRA_STATE.equals(mBluetoothAdapter.STATE_TURNING_OFF)))
        mBluetoothAdapter.enable();
    else
        startScan();
    
}