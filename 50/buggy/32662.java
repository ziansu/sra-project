public void tryToEnableBluetooth() {
    android.util.Log.d("BT", "tryToEnableBluetooth");
    if (!(mBluetoothAdapter.isEnabled())) {
        android.content.Intent enableBluetooth = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
        owner.startActivityForResult(enableBluetooth, 0);
    }
}