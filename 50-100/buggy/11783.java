@java.lang.Override
public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder service) {
    mBluetoothLeService = ((com.cooper.wheellog.BluetoothLeService.LocalBinder) (service)).getService();
    if (!(mBluetoothLeService.initialize())) {
        android.util.Log.e(TAG, "Unable to initialize Bluetooth");
        finish();
    }
    if (mBluetoothLeService.isConnected()) {
        mConnectionState = BluetoothLeService.STATE_CONNECTED;
        buttonConnect.setText("DISCONNECT");
    }
}