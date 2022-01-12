public void stop() {
    if (connected) {
        try {
            clientSocket.close();
            clientSocket = null;
        } catch (java.io.IOException e) {
            android.util.Log.w(TAG, e.getMessage());
        }
        out.flush();
        out.close();
    }
}