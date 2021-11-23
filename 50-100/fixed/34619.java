private void waitForEndMarker(long timeout) {
    if (timeout == 0) {
        while (!(mReachedEndMarker)) {
            try {
                mReachedEndMarkerCondition.await();
            } catch (java.lang.InterruptedException ignored) {
            }
        } 
    }else {
        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(timeout);
        while (!(mReachedEndMarker)) {
            if (nanos <= 0L) {
                break;
            }
            try {
                nanos = mReachedEndMarkerCondition.awaitNanos(nanos);
            } catch (java.lang.InterruptedException ignored) {
            }
        } 
    }
}