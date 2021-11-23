private boolean startScreenCapture() {
    android.util.Log.d(TAG, ((("mResultCode: " + (mResultCode)) + ", mResultData: ") + (mResultData)));
    if (((mResultCode) != 0) && ((mResultData) != null)) {
        setUpMediaProjection();
        showNotification();
        startRecording();
        return true;
    }
    return false;
}