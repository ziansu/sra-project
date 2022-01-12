private void startRecordingVideo() {
    mIsRecordingVideo = true;
    mMediaRecorder.reset();
    createCameraPreviewSession();
    try {
        mMediaRecorder.start();
    } catch (java.lang.IllegalStateException e) {
        e.printStackTrace();
    }
}