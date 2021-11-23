public void cancel() {
    android.util.Log.d(com.henrykvdb.sttt.Bluetooth.TAG, ("cancel " + (this)));
    try {
        listenLock.lock();
        serverSocket.close();
        listenThread = null;
        listenLock.unlock();
    } catch (java.io.IOException e) {
        android.util.Log.e(com.henrykvdb.sttt.Bluetooth.TAG, "close() of server failed", e);
    }
}