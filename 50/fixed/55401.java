public void unRegisterBleBroadcastReceiver() {
    if ((mGattReceiver) != null) {
        com.hqw.bleproxy.BleProxyApp.getContext().unregisterReceiver(mGattReceiver);
        mGattReceiver = null;
    }
}