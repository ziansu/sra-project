public void cancel() {
    try {
        socket.close();
    } catch (java.io.IOException e) {
        android.util.Log.e(com.henrykvdb.sttt.Bluetooth.TAG, "close() of connect socket failed", e);
    }
}