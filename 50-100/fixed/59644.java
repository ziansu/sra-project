@java.lang.Override
public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder service) {
    mBound = true;
    mBluetoothLeService = ((edu.nthu.nmsl.itri_app.BluetoothLeService.LocalBinder) (service)).getService();
    if (!(mBluetoothLeService.initialize())) {
        finish();
    }
    mBluetoothLeService.connect(edu.nthu.nmsl.itri_app.settings.Devices.getInstance().getDeviceAddress(edu.nthu.nmsl.itri_app.Background.getInstance().getUsingSensorID()));
}