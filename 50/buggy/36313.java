public void cancel() {
    try {
        inputStream.close();
        mmSocket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}