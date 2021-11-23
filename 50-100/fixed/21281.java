protected void onPause() {
    super.onPause();
    android.util.Log.d(com.hunter.camservice.MainActivity.TAG, "MainActivity onPause");
    if (isRecording) {
        mMediaRecorder.stop();
        isRecording = false;
    }
    captureButton.setImageResource(android.R.drawable.ic_menu_camera);
    releaseMediaRecorder();
    releaseCamera();
    stopConnectivityService();
}