@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName componentName) {
    mBluetoothLeService = null;
    mBound = false;
}