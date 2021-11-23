@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((receiver) != null) {
        unregisterReceiver(receiver);
        receiver = null;
        unregisterReceiver(orderBroadcastReceiver);
        unregisterReceiver(orderBroadcastReceiver1);
        orderBroadcastReceiver = null;
        orderBroadcastReceiver1 = null;
    }
}