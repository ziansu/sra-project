@java.lang.Override
public boolean waitTillRunning(long timeoutInMs) throws java.lang.InterruptedException {
    long t = java.lang.System.currentTimeMillis();
    synchronized(startupMonitor) {
        while ((!(isRunning())) && (((java.lang.System.currentTimeMillis()) - t) < timeoutInMs)) {
            startupMonitor.wait(timeoutInMs);
        } 
    }
    return isRunning();
}