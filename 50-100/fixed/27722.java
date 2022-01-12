public void turnBluetoothOn() {
    android.bluetooth.BluetoothAdapter btAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if (btAdapter != null) {
        android.util.Log.i(de.dralle.bluetoothtest.BGS.LocalBluetoothManager.LOG_TAG, "Turning bluetooth on");
        if (!(btAdapter.isEnabled())) {
            android.content.Intent btOnRequest = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
            btOnRequest.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(btOnRequest);
        }else {
            android.util.Log.v(de.dralle.bluetoothtest.BGS.LocalBluetoothManager.LOG_TAG, "Bluetooth already on");
        }
    }
}