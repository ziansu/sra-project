public void stopRecording() {
    try {
        mMediaRecorder.stop();
        mRecorderStateListener.onRecorderStateChanged(RecorderStateListener.CODE_OF_STATE_STOP);
    } catch (java.lang.IllegalStateException e) {
        mRecorderStateListener.onError(RecorderStateListener.ERROR_CODE_OF_START_BEFORE_PREPARE);
    } catch (java.lang.RuntimeException e) {
        initial();
    }
}