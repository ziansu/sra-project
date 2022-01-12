public java.lang.String readOnce(java.lang.String cmd) {
    synchronized(lock12) {
        return executeCommand(cmd);
    }
}