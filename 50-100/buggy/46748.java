public void close() {
    if ((mVideo) != null) {
        mBackgroundHandler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                if (mCurrentlyRecording) {
                    stopRecordingSync();
                    mCurrentlyRecording = false;
                }
                mVideo.release();
                mVideo = null;
            }
        });
    }
    if ((mCaptureSession) != null) {
        mCaptureSession.close();
    }
    if ((mCamera) != null) {
        mCamera.close();
    }
}