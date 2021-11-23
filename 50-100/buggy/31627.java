public void stopConnection() {
    clientConnectionThread.stop = true;
    try {
        socketChannel.close();
        selector.close();
    } catch (java.io.IOException e) {
        android.util.Log.e(TAG, ("Exception:" + (e.getMessage())));
    }
}