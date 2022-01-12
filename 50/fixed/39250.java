public void startPlayback() {
    if ((mIn) != null) {
        mRun = true;
        thread.start();
    }
}