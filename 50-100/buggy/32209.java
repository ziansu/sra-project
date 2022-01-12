@java.lang.Override
public void run() {
    if (mBluetoothAdapter.isDiscovering())
        mBluetoothAdapter.cancelDiscovery();
    
    if ((mSocket) != null) {
        try {
            if ((outputStream) != null)
                outputStream.close();
            
            mSocket.close();
            mSocket = null;
        } catch (java.io.IOException e) {
            sendError(e.getMessage(), true);
        }
    }
    if ((callback) != null)
        callback.onSuccessful();
    
}