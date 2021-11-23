@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((mBluetoothLeService) != null) {
        if (isConnected())
            this.mBluetoothLeService.disconnect();
        
    }
    mBluetoothLeService = null;
}