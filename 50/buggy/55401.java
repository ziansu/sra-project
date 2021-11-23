public void unRegisterBleBroadcastReceiver() {
    com.hqw.bleproxy.BleProxyApp.getContext().unregisterReceiver(mGattReceiver);
    mGattReceiver = null;
}