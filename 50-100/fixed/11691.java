@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    checkCameraHardware();
    if (isRecording) {
        mMediaRecorder.stop();
        releaseMediaRecorder();
        mCamera.lock();
        isRecording = false;
    }else {
        if (prepareVideoRecorder()) {
            mMediaRecorder.start();
            mMediaRecorder.setMaxDuration(30000);
            isRecording = true;
        }else {
            releaseMediaRecorder();
        }
    }
}