@java.lang.Override
public int onStartCommand(com.artur.softwareproject.Intent intent, int flags, int startId) {
    this.serviceIntent = intent;
    if ((intent.getExtras().get("device")) != null) {
        bDevice = ((android.bluetooth.BluetoothDevice) (intent.getExtras().get("device")));
        mBluetoothGatt = bDevice.connectGatt(this, false, mGattCallback);
    }
    return super.onStartCommand(intent, flags, startId);
}