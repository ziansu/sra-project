public void startPlayback() {
    if (((mIn) != null) && ((mRun) != true)) {
        mRun = true;
        thread.start();
    }
}