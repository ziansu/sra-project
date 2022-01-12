@java.lang.Override
public void clear() {
    isConnected = false;
    if ((connectThread) != null) {
        connectThread.interrupt();
        connectThread.cancel();
        connectThread = null;
    }
    mSocket = null;
}