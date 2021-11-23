@java.lang.Override
public void run() {
    sendZipMessage();
    updateConnectionState();
    connectionStatusHandler.postDelayed(this, updatePeriodMilliSeconds);
}