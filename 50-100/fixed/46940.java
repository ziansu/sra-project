@java.lang.Override
public void run() {
    try {
        mmSocket.connect();
        com.quadcoder.coinpet.bluetooth.BluetoothManager.ChatThread chat = new com.quadcoder.coinpet.bluetooth.BluetoothManager.ChatThread(mmSocket);
        android.util.Log.d(com.quadcoder.coinpet.bluetooth.BluetoothManager.TAG, "Bluetooth Connect Success");
    } catch (java.io.IOException e) {
        try {
            mmSocket.close();
        } catch (java.io.IOException e2) {
            android.util.Log.e(com.quadcoder.coinpet.bluetooth.BluetoothManager.TAG, "unable to close() socket during connection failure", e2);
        }
        connectionFailed();
        return ;
    }
    synchronized(this) {
        mConnectThread = null;
    }
    connected(mmSocket, mmDevice);
}