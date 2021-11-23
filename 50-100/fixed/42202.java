private void stopRecording() {
    mRecorder.stop();
    mRecorder.reset();
    mRecorder.release();
    mRecorder = null;
    mWindowManager.removeView(mSurfaceView);
    android.util.Log.e(LogUtil.TAG, "Recording video: stop");
    com.google.gson.JsonObject data = new com.google.gson.JsonObject();
    data.addProperty(edu.mit.media.funf.probe.builtin.FILENAME, mFileName);
    sendData(data);
    stop();
}