@java.lang.Override
public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder service) {
    com.example.sdp11.wmd.MainActivity.mBluetoothLEService = ((com.example.sdp11.wmd.BluetoothLEService.LocalBinder) (service)).getService();
    if (!(com.example.sdp11.wmd.MainActivity.mBluetoothLEService.initialize())) {
        android.util.Log.i(com.example.sdp11.wmd.MainActivity.TAG, "Unable to initialize Bluetooth");
        finish();
    }
}