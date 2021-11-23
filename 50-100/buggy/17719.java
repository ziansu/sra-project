@java.lang.Override
public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder service) {
    mBluetoothLeService = ((com.example.andrewgardiner.myhearthealth.BluetoothLeService.LocalBinder) (service)).getService();
    if (!(mBluetoothLeService.initialize())) {
        android.util.Log.e(com.example.andrewgardiner.myhearthealth.EnterActivity.TAG, "Unable to initialize Bluetooth");
        finish();
    }
    android.util.Log.d(com.example.andrewgardiner.myhearthealth.EnterActivity.TAG, "binded");
    mBluetoothLeService.connect(mDeviceAddress);
}