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
    super.onDestroy();
}