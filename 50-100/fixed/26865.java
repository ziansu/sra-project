public void exit() {
    final java.util.Set<com.deepercreeper.vampireapp.connection.ConnectedDevice> devices = new java.util.HashSet<com.deepercreeper.vampireapp.connection.ConnectedDevice>();
    devices.addAll(mDevices);
    for (final com.deepercreeper.vampireapp.connection.ConnectedDevice device : devices) {
        disconnect(device);
    }
    stopServer();
    try {
        mContext.unregisterReceiver(mReceiver);
    } catch (final java.lang.IllegalArgumentException e) {
    }
}