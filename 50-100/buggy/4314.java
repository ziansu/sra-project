public void run() {
    android.util.Log.i(com.example.bluetooth.BluetoothSerialService.TAG, "BEGIN mConnectedThread");
    byte[] buffer = new byte[1024];
    int bytes;
    while (true) {
        try {
            bytes = mmInStream.read(buffer);
            mHandler.obtainMessage(MainActivity.MESSAGE_READ, bytes, (-1), buffer).sendToTarget();
        } catch (java.io.IOException e) {
            android.util.Log.e(com.example.bluetooth.BluetoothSerialService.TAG, "disconnected", e);
            connectionLost(mDevice);
            this.start();
            break;
        }
    } 
}