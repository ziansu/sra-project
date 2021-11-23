private void checkForDBLockRelease(int waitTime) {
    while (mDb.isDbLockedByOtherThreads()) {
        try {
            java.lang.Thread.sleep(waitTime);
            android.util.Log.i("TvTicker DbAdapter", "Waiting for DB lock to be released");
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}