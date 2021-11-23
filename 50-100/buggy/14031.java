private boolean startBluetooth() {
    android.bluetooth.BluetoothAdapter mBluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if (mBluetoothAdapter == null) {
        android.widget.Toast.makeText(this, R.string.ble_not_supported, Toast.LENGTH_SHORT).show();
        return false;
    }
    if (!(mBluetoothAdapter.isEnabled())) {
        android.content.Intent enableBtIntent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(enableBtIntent, com.jpodczerwinski.beacon.activity.main.MainActivity.REQUEST_ENABLE_BT);
    }
    return true;
}