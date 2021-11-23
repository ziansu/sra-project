public void setLog(java.io.File clientLog) {
    lastLine = de.poe.notifier.util.Utility.getLastLineFast(clientLog);
    this.clientLog = clientLog;
}