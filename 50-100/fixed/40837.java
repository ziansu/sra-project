void setAlias(android.bluetooth.BluetoothDevice device, java.lang.String mAlias) {
    synchronized(mObject) {
        this.mAlias = mAlias;
        if (mAlias == null)
            return ;
        
        com.android.bluetooth.btservice.RemoteDevices.mAdapterService.setDevicePropertyNative(mAddress, AbstractionLayer.BT_PROPERTY_REMOTE_FRIENDLY_NAME, mAlias.getBytes());
        android.content.Intent intent = new android.content.Intent(android.bluetooth.BluetoothDevice.ACTION_ALIAS_CHANGED);
        intent.putExtra(BluetoothDevice.EXTRA_DEVICE, device);
        intent.putExtra(BluetoothDevice.EXTRA_NAME, mAlias);
        com.android.bluetooth.btservice.RemoteDevices.mAdapterService.sendBroadcast(intent, AdapterService.BLUETOOTH_PERM);
    }
}