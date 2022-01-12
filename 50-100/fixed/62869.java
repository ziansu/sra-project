private void cancel() {
    try {
        inStream.close();
        outStream.close();
        socket.close();
        cancelled = true;
    } catch (java.io.IOException | java.lang.NullPointerException e) {
        android.util.Log.e(com.henrykvdb.sttt.Bluetooth.TAG, "close() of connect socket failed", e);
    }
}