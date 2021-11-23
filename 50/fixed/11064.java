@java.lang.Override
void startVideo() {
    synchronized(this) {
        initMediaRecorder();
        prepareMediaRecorder();
        mMediaRecorder.start();
    }
}