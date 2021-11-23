@android.annotation.SuppressLint(value = "Assert")
void release() {
    assert (mProcessingThread.getState()) == (java.lang.Thread.State.TERMINATED);
    mDetector.release();
    mDetector = null;
}