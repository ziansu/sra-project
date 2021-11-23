@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unregisterReceiver(receiver);
    if (bluetoothAdapter.isDiscovering()) {
        bluetoothAdapter.cancelDiscovery();
    }
}