@java.lang.Override
public void run() {
    if (status == (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        mIsStartService.set(true);
        mAlertHandler.removeCallbacksAndMessages(null);
        android.util.Log.d(com.billin.www.rxble.ble.originV2.BluetoothLeConnector.TAG, ("进入通道连接！！！！ in thread " + (java.lang.Thread.currentThread())));
        mOnConnectListener.onServiceDiscover();
    }else {
        java.lang.String err = "onServicesDiscovered received: " + status;
        android.util.Log.e(com.billin.www.rxble.ble.originV2.BluetoothLeConnector.TAG, err);
        gatt.disconnect();
    }
}