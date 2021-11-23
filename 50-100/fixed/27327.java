private void setupBroadcastReceiver() {
    android.content.IntentFilter filter = new android.content.IntentFilter(android.bluetooth.BluetoothDevice.ACTION_FOUND);
    filter.addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
    filter.addAction(AmarinoIntent.ACTION_CONNECT);
    filter.addAction(AmarinoIntent.ACTION_CONNECTED);
    filter.addAction(AmarinoIntent.ACTION_CONNECTION_FAILED);
    filter.addAction(AmarinoIntent.ACTION_DISCONNECTED);
    filter.addAction(AmarinoIntent.ACTION_CONNECTED_DEVICES);
    registerReceiver(mBroadcastReceiver, filter);
}