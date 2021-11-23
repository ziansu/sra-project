@java.lang.Override
void startVideo() {
    initMediaRecorder();
    prepareMediaRecorder();
    mMediaRecorder.start();
}