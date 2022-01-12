protected void waitForResponse() {
    synchronized(mLockObj) {
        try {
            mLockObj.wait(mTimeout);
        } catch (java.lang.InterruptedException e) {
        }
    }
}