@java.lang.Override
protected void onBluetoothEnabled() {
    super.onBluetoothEnabled();
    mServerManager = new no.nordicsemi.android.nrftoolbox.proximity.ProximityServerManager(this);
    mServerManager.setLogger(mBinder);
    mServerManager.openGattServer(this, new no.nordicsemi.android.nrftoolbox.proximity.ProximityServerManager.OnServerOpenCallback() {
        @java.lang.Override
        public void onGattServerOpen() {
            no.nordicsemi.android.nrftoolbox.proximity.ProximityService.super.onBluetoothEnabled();
        }
    });
}