public void sendAlert() throws java.lang.RuntimeException {
    android.util.Log.i(io.github.fbmediahack.quiethome.AudioDetector.LOG_TAG, "BE QUIET I AM Sleeping");
    this.stopThread();
    noiceListener.onNoiceDetected();
}