@java.lang.Override
public void resume() {
    mStopWatcher.resume();
    mHandler.removeCallbacks(mUiUpdate);
    mHandler.post(mUiUpdate);
}