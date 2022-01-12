@java.lang.Override
public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder service) {
    mBound = true;
    android.util.Log.e(edu.nthu.nmsl.itri_app.FragmentActivity.TAG, "onServiceConnected");
    mBluetoothLeService = ((edu.nthu.nmsl.itri_app.BluetoothLeService.LocalBinder) (service)).getService();
    if (!(mBluetoothLeService.initialize())) {
        android.util.Log.e(edu.nthu.nmsl.itri_app.FragmentActivity.TAG, "Unable to initialize Bluetooth");
        finish();
    }
    mBluetoothLeService.connect(edu.nthu.nmsl.itri_app.settings.Devices.getInstance().getDeviceAddress(edu.nthu.nmsl.itri_app.Background.getInstance().getUsingSensorID()));
}