public void run() {
    int newRotation;
    while ((mWaitCounter) < (WAIT_TIMES_MS.length)) {
        com.android.server.audio.RotationHelper.updateOrientation();
        int waitTimeMs;
        synchronized(mCounterLock) {
            waitTimeMs = WAIT_TIMES_MS[mWaitCounter];
            (mWaitCounter)++;
        }
        try {
            java.lang.Thread.sleep(waitTimeMs);
        } catch (java.lang.InterruptedException e) {
        }
    } 
}