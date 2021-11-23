public void run() {
    com.example.android.common.logger.Log.i(com.lagendary.djboard.BluetoothService.TAG, "BEGIN mConnectedThread");
    byte[] buffer = new byte[1024];
    int bytes;
    while (true) {
        try {
            bytes = mmInStream.read(buffer);
            mHandler.obtainMessage(Constants.MESSAGE_READ, bytes, (-1), buffer).sendToTarget();
        } catch (java.io.IOException e) {
            com.example.android.common.logger.Log.e(com.lagendary.djboard.BluetoothService.TAG, "disconnected", e);
            connectionLost();
            this.start();
            break;
        }
    } 
}