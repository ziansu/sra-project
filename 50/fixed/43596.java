public void cancel() {
    try {
        if ((serverSocket) != null) {
            serverSocket.close();
        }
    } catch (java.io.IOException e) {
        android.util.Log.e("listenThread", e.getMessage());
    }
}