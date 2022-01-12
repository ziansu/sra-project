public boolean bluetooth_is_available() {
    bt_adapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    boolean result = (bt_adapter) != null;
    if (!result) {
        new android.app.AlertDialog.Builder(this).setTitle(R.string.no_bluetooth_title).setMessage((((getString(R.string.no_bluetooth_message)) + " ") + (getString(R.string.bluetooth_not_available)))).setPositiveButton(R.string.understood, this).show();
    }
    return result;
}