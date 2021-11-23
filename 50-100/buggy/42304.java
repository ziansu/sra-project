protected void onBleServiceConnected(android.os.IBinder service) {
    android.util.Log.d(org.md2k.motionsense.bluetooth.MyBlueTooth.TAG, "[IN]onBleReceiveMessage");
    mBleService = ((org.md2k.motionsense.bluetooth.BleService.MyServiceLocalBinder) (service)).getService();
    mBleService.setCurrentContext(context.getApplicationContext(), mBinder);
    if (!(isEnabled()))
        enable();
    else
        onConnectionListener.onConnected();
    
}