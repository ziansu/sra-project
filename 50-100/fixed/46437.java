public boolean connect() {
    boolean res = false;
    mBluetoothAdapter = bluetoothManager.getAdapter();
    if (((mBluetoothAdapter) == null) || (!(mBluetoothAdapter.isEnabled()))) {
        android.content.Intent enableBltIntent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
        activity.startActivityForResult(enableBltIntent, com.ol.andon.reflex.services.MicroBitCommsService.REQUEST_ENABLE_BT);
        res = true;
    }
    scanForDevice();
    return res;
}