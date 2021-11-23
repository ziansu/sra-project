public synchronized void cancel() {
    com.smartdevicelink.transport.MultiplexBluetoothTransport.listening = false;
    android.util.Log.d(com.smartdevicelink.transport.MultiplexBluetoothTransport.TAG, ((((com.smartdevicelink.transport.MultiplexBluetoothTransport.mState) + " Socket Type ") + (mSocketType)) + " cancel "));
    try {
        if ((mmServerSocket) != null) {
            mmServerSocket.close();
        }
    } catch (java.io.IOException e) {
        android.util.Log.e(com.smartdevicelink.transport.MultiplexBluetoothTransport.TAG, (((((com.smartdevicelink.transport.MultiplexBluetoothTransport.mState) + " Socket Type ") + (mSocketType)) + " close() of server failed ") + (e.getStackTrace())));
    }
}