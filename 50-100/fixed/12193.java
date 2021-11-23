private void Disconnect() {
    if ((connectDevice) == null)
        BroadcastError(Constants.MBOTSERVICE_DISCONNECT_RESULT_ACTION, Constants.MBOTSERVICE_ERROR_NO_DEVICE_CONNECT);
    else {
        try {
            socket.close();
        } catch (java.io.IOException e) {
        }
        android.bluetooth.BluetoothDevice device = connectDevice;
        BroadcastResult(Constants.MBOTSERVICE_DISCONNECT_RESULT_ACTION, Constants.BLUETOOTH_DEVICE, device);
        Cleanup();
        serialAdapter.Shutdown();
    }
}