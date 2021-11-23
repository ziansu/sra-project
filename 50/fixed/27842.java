@java.lang.Override
public void onActivityStop() {
    if ((mHandler) != null) {
        postStopSample();
        mHandler.getLooper().quitSafely();
        mHandler = null;
    }
}