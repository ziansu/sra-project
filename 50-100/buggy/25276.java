public void restart() {
    if (mClosed) {
        java.lang.System.err.println("Socket is closed.");
    }else {
        mRunning = false;
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        sending();
    }
}