@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unbindService(mServiceConnection);
    mBluetoothLeService = null;
    mSensorManager.unregisterListener(mAccLis);
}