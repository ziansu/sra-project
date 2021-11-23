@java.lang.Override
public void onDestroy() {
    if (((status) == (Status.INIT)) || ((status) == (Status.RUNNING))) {
        notification.interrupt();
        process.interrupt();
    }
    if (((wakeLock) != null) && (wakeLock.isHeld()))
        wakeLock.release();
    
    super.onDestroy();
}