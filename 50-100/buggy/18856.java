public void run() {
    try {
        mSocket = mDevice.createRfcommSocketToServiceRecord(mUuid);
        mCallback.onFailure("Could not create socket.");
        mSocket.connect();
    } catch (java.io.IOException connectException) {
        android.util.Log.e(com.example.jkn.bluetoothtest.BtConnectThread.TAG, "Could not create socket.", connectException);
        try {
            mSocket.close();
        } catch (java.io.IOException closeException) {
            android.util.Log.e(com.example.jkn.bluetoothtest.BtConnectThread.TAG, "Could not close the client socket", closeException);
        }
        mCallback.onFailure("Could not connect to socket.");
        return ;
    }
    mCallback.onSuccess(mSocket);
}