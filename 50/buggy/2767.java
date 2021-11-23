@java.lang.Override
public void clear() {
    isConnected = false;
    connectThread.interrupt();
    connectThread.cancel();
    connectThread = null;
    mSocket = null;
}