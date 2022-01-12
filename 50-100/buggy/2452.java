void checkBluetooth() {
    lilium.arubabacon.MainActivity.btManager = ((android.bluetooth.BluetoothManager) (getSystemService(Context.BLUETOOTH_SERVICE)));
    lilium.arubabacon.MainActivity.btAdapter = lilium.arubabacon.MainActivity.btManager.getAdapter();
    if (((lilium.arubabacon.MainActivity.btAdapter) != null) && (!(lilium.arubabacon.MainActivity.btAdapter.isEnabled()))) {
        android.content.Intent enableIntent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(enableIntent, 1);
    }else {
        setup();
    }
}