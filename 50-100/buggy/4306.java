private void connect() {
    mBtConnectThread = new com.example.jkn.bluetoothtest.BtConnectThread(mBtDevice, com.example.jkn.bluetoothtest.MainActivity.SPP_UUID, new com.example.jkn.bluetoothtest.BtConnectThread.BtConnectionCallback() {
        @java.lang.Override
        public void onSuccess(android.bluetooth.BluetoothSocket bluetoothSocket) {
            mBtSocket = bluetoothSocket;
            setConnectionStatus(BtConnectionStatus.CONNECTED);
            android.util.Log.d(com.example.jkn.bluetoothtest.MainActivity.TAG, "Connection attempt succeeded.");
        }

        @java.lang.Override
        public void onFailure(java.lang.String message) {
            setConnectionStatus(BtConnectionStatus.NOT_CONNECTED);
            android.util.Log.d(com.example.jkn.bluetoothtest.MainActivity.TAG, message);
        }
    });
    mBtConnectThread.run();
}