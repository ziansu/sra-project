@android.annotation.SuppressLint(value = "Assert")
void release() {
    assert (mProcessingThread.getState()) == (java.lang.Thread.State.TERMINATED);
    if ((mDetector) != null) {
        mDetector.release();
        mDetector = null;
    }
}