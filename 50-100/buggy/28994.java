public void goOn() {
    long seconds = (android.os.SystemClock.elapsedRealtime()) - (mBase);
    seconds /= 1000;
    seconds = (time) - seconds;
    if (seconds <= 0) {
        return ;
    }
    mStarted = true;
    updateRunning();
}