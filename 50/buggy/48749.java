@java.lang.Override
protected void onPause() {
    super.onPause();
    askMplayerThread.interrupt();
    readTimeLengthThread.interrupt();
    readTimePositionThread.interrupt();
    readProgressThread.interrupt();
    lock.reenableKeyguard();
}