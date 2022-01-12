private void ConnectTo(android.bluetooth.BluetoothDevice device) {
    android.bluetooth.BluetoothSocket socket = null;
    try {
        socket = device.createRfcommSocketToServiceRecord(com.inker.mblockly.MBotServer.MBotService.MY_UUID);
        socket.connect();
        connectDevice = device;
        this.socket = socket;
        BroadcastResult(Constants.MBOTSERVICE_CONNECT_RESULT_ACTION, Constants.BLUETOOTH_DEVICE, device);
    } catch (java.io.IOException e) {
        Cleanup();
        BroadcastError(Constants.MBOTSERVICE_CONNECT_RESULT_ACTION, e);
    }
    if ((this.socket) != null) {
        serialAdapter.Start(socket);
    }
}