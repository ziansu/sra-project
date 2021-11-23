private void Disconnect() {
    if ((connectDevice) == null)
        BroadcastError(Constants.MBOTSERVICE_DISCONNECT_RESULT_ACTION, Constants.MBOTSERVICE_ERROR_NO_DEVICE_CONNECT);
    else {
        try {
            socket.close();
            android.bluetooth.BluetoothDevice device = connectDevice;
            BroadcastResult(Constants.MBOTSERVICE_DISCONNECT_RESULT_ACTION, Constants.BLUETOOTH_DEVICE, device);
        } catch (java.io.IOException e) {
            BroadcastError(Constants.MBOTSERVICE_DISCONNECT_RESULT_ACTION, e);
        } finally {
            Cleanup();
            serialAdapter.Shutdown();
        }
    }
}