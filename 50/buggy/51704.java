public void closeConnection() {
    if ((gameRunnable) != null) {
        gameRunnable.cancel();
        gameRunnable = null;
    }else
        if ((serviceThread) != null) {
            serviceThread.cancel();
            serviceThread = null;
        }
    
}