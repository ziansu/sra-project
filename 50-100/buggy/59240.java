public void stop() {
    android.util.Log.w(TAG, "Stopped ble-scan");
    if ((android.os.Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP_MR1)) {
        bluetoothAdapter.getBluetoothLeScanner().stopScan(scanCallback);
        bleButton.setImageResource(R.drawable.bluetooth_off);
    }else {
        bluetoothAdapter.stopLeScan(leScanCallback);
        bleButton.setImageResource(R.drawable.bluetooth_off);
    }
}