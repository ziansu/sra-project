private void releaseMediaRecorder() {
    if ((mediaRecorder) != null) {
        if ((recordingPromise) != null)
            mediaRecorder.stop();
        
        mediaRecorder.reset();
        mediaRecorder.release();
        mediaRecorder = null;
    }
    if ((mCamera) != null) {
        mCamera.lock();
        mCamera = null;
    }
    if ((recordingPromise) != null) {
        recordingPromise.resolve(android.net.Uri.fromFile(videoFile).toString());
        recordingPromise = null;
    }
}