public void close() {
    try {
        mContext.unregisterReceiver(mBondingBroadcastReceiver);
        mContext.unregisterReceiver(mPairingRequestBroadcastReceiver);
    } catch (java.lang.Exception e) {
    }
    synchronized(mLock) {
        if ((mBluetoothGatt) != null) {
            no.nordicsemi.android.log.Logger.d(mLogSession, "gatt.close()");
            mBluetoothGatt.close();
            mBluetoothGatt = null;
        }
        mBluetoothDevice = null;
        mUserDisconnected = false;
    }
}