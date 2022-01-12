@java.lang.Override
protected void onStart() {
    super.onStart();
    android.util.Log.w("Main", "onStart called");
    registerReceiver(scanModeReceiver, new android.content.IntentFilter(android.bluetooth.BluetoothAdapter.ACTION_SCAN_MODE_CHANGED));
    registerReceiver(bluetoothStateReceiver, new android.content.IntentFilter(android.bluetooth.BluetoothAdapter.ACTION_STATE_CHANGED));
    registerReceiver(rfduinoReceiver, com.lannbox.rfduinotest.RFduinoService.getIntentFilter());
    if ((state) < (com.lannbox.rfduinotest.MainActivity.STATE_DISCONNECTED)) {
        updateState((bluetoothAdapter.isEnabled() ? com.lannbox.rfduinotest.MainActivity.STATE_DISCONNECTED : com.lannbox.rfduinotest.MainActivity.STATE_BLUETOOTH_OFF));
    }
}