public void closeConnection() {
    if ((serviceThread) != null) {
        serviceThread.cancel();
        serviceThread = null;
    }
}