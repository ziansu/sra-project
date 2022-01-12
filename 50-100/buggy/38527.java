public void run() {
    mBluetoothAdapter.cancelDiscovery();
    try {
        mmSocket.connect();
    } catch (java.io.IOException connectException) {
        try {
            mmSocket.close();
        } catch (java.io.IOException closeException) {
            android.util.Log.e("ERROR", "unable to close() socket during connection failure");
        }
        return ;
    }
    manageConnectedSocket(mmSocket);
}