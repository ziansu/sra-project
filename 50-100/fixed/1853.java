private void releaseResources() {
    if ((mSendLooper) != null) {
        mSendLooper.quit();
    }
    if ((mSendHandler) != null) {
        mSendHandler.removeCallbacks(mSendTask);
    }
    if (((mRecSession) != null) && (!(mRecSession.isFinished()))) {
        mRecSession.cancel();
    }
    if ((mRecorder) != null) {
        mRecorder.release();
        mRecorder = null;
    }
}