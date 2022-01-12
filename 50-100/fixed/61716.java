@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mLocService) != null) {
        mLocService.removeGpsStatusListener(this);
        mLocService.removeUpdates(this);
    }
    releaseWakeLockIfHeld();
    if (isServiceBound) {
        doUnbindService();
    }
    final android.bluetooth.BluetoothAdapter btAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if (((btAdapter != null) && (btAdapter.isEnabled())) && (!(pt.lighthouselabs.obd.reader.activity.MainActivity.bluetoothDefaultIsEnable)))
        btAdapter.disable();
    
}