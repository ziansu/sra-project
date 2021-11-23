private void startRecordingVideo() {
    try {
        mIsRecordingVideo = true;
        mMediaRecorder.reset();
        createCameraPreviewSession();
        mMediaRecorder.start();
    } catch (java.lang.IllegalStateException e) {
        e.printStackTrace();
    }
}