public void sendLineToAll(java.lang.String line, final com.richardchien.android.bluetoothcommunicator.listener.SendListener listener) {
    for (final android.bluetooth.BluetoothDevice device : mConnections.keySet()) {
        mConnections.get(device).writeLine(line);
        if (listener != null) {
            mHandler.post(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    listener.onSucceed(device);
                }
            });
        }
    }
}