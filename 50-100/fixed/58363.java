private void diskonekPerangkat() {
    if (mConnected) {
        try {
            if ((mBluetoothSocket) != null) {
                mBluetoothSocket.close();
                mBluetoothSocket = null;
            }
        } catch (java.io.IOException e) {
            mBluetoothSocket = null;
        }
    }
    mConnected = false;
}