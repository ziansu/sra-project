public void onClickStartStop(android.view.View view) {
    java.lang.Boolean bRunning = (mTimeCounterThread) != null;
    if (!bRunning) {
        InitGoogleMap();
        mTimeCounterThread = new com.android.tobe.tobesgps.gui.TimeCounterThread(this);
        mTimeCounterThread.start();
        mDistanceCounterThread.start();
        bRunning = true;
    }else {
        ShutdownAllThreads();
        mDistanceCounterThread.stop();
        bRunning = false;
    }
    ((android.widget.Button) (findViewById(R.id.btnStartStop))).setText((bRunning ? R.string.button_stop : R.string.button_start));
}