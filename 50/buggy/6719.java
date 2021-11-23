public void release() {
    stop();
    mRecorder.release();
    started = false;
}