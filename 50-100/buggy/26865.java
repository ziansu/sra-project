public void exit() {
    final java.util.Set<com.deepercreeper.vampireapp.connection.ConnectedDevice> devices = new java.util.HashSet<com.deepercreeper.vampireapp.connection.ConnectedDevice>();
    devices.addAll(mDevices);
    mDevices.clear();
    for (final com.deepercreeper.vampireapp.connection.ConnectedDevice device : devices) {
        if (device.isHost()) {
            device.send(MessageType.LEFT_GAME);
        }else {
            device.send(MessageType.CLOSED);
        }
        disconnect(device);
    }
    stopServer();
    try {
        mContext.unregisterReceiver(mReceiver);
    } catch (final java.lang.IllegalArgumentException e) {
    }
}