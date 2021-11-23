private void startTrackEdit(android.bluetooth.BluetoothGatt gatt) {
    if ((mConnectedBluetoothGatt) != null) {
        com.antilost.app.activity.ScanTrackActivity.sBluetoothConnected = gatt;
        android.content.Intent i = new android.content.Intent(this, com.antilost.app.activity.TrackREditActivity.class);
        i.putExtra(TrackREditActivity.BLUETOOTH_ADDRESS_BUNDLE_KEY, gatt.getDevice().getAddress());
        i.putExtra(TrackREditActivity.EXTRA_EDIT_NEW_TRACK, true);
        startActivity(i);
        finish();
    }
}