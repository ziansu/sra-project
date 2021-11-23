public void readOnce(java.lang.String cmd) {
    synchronized(lock12) {
        executeCommand(cmd);
    }
}