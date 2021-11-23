public static boolean atMost(com.android.launcher3.util.Condition condition, long timeout, long sleepMillis) {
    long endTime = (android.os.SystemClock.uptimeMillis()) + timeout;
    while ((android.os.SystemClock.uptimeMillis()) < endTime) {
        try {
            if (condition.isTrue()) {
                return true;
            }
        } catch (java.lang.Throwable t) {
        }
        android.os.SystemClock.sleep(sleepMillis);
    } 
    return false;
}