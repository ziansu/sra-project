public void stop() {
    if (connected) {
        try {
            clientSocket.close();
        } catch (java.io.IOException e) {
            android.util.Log.w(TAG, e.getMessage());
        }
        out.flush();
        out.close();
    }
}