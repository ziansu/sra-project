private synchronized void close() {
    if ((mHandshakeThread) != null) {
        mHandshakeThread.close(false);
        mHandshakeThread = null;
    }
    if ((mBluetoothSocket) != null) {
        try {
            mBluetoothSocket.close();
        } catch (java.io.IOException e) {
            android.util.Log.w(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.BluetoothClientThread.TAG, ("Failed to close the socket: " + (e.getMessage())));
        }
        mBluetoothSocket = null;
    }
}