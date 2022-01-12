public void run() {
    while ((mWaitCounter) < (WAIT_TIMES_MS.length)) {
        int waitTimeMs;
        synchronized(mCounterLock) {
            waitTimeMs = ((mWaitCounter) < (WAIT_TIMES_MS.length)) ? WAIT_TIMES_MS[mWaitCounter] : 0;
            (mWaitCounter)++;
        }
        try {
            if (waitTimeMs > 0) {
                java.lang.Thread.sleep(waitTimeMs);
                com.android.server.audio.RotationHelper.updateOrientation();
            }
        } catch (java.lang.InterruptedException e) {
        }
    } 
}