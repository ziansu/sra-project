public void run() {
    android.util.Log.i(com.etheli.arduvidrx.BluetoothSerialService.TAG, "BEGIN mConnectedThread");
    byte[] buffer = new byte[1024];
    int bytes;
    while (true) {
        try {
            bytes = mmInStream.read(buffer);
            mDataWriteReceiverObj.write(buffer, bytes);
        } catch (java.io.IOException e) {
            if (mmCanceledFlag)
                android.util.Log.d(com.etheli.arduvidrx.BluetoothSerialService.TAG, "disconnected by user");
            else
                android.util.Log.e(com.etheli.arduvidrx.BluetoothSerialService.TAG, "disconnected", e);
            
            connectionLost(mmCanceledFlag);
            break;
        }
    } 
}