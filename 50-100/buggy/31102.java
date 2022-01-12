@java.lang.Override
protected void onDestroy() {
    com.socks.library.KLog.d();
    scanDevice(false, true);
    if ((mGatt) != null) {
        mGatt.disconnect();
        mGatt.close();
        mGatt = null;
    }
    unregisterReceiver(mBleConnectReceiver);
    com.ppcrong.blehelper.BleHelper.setIsAutoConnect(mContext, mCbAutoConnect.isChecked());
    com.ppcrong.blehelper.BleHelper.setIsPairEnabled(mContext, mCbPairDevice.isChecked());
    super.onDestroy();
}