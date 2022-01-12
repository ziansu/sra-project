private void stopRecorder() {
    try {
        recorder.stop();
        recorder.release();
    } catch (java.lang.IllegalStateException e) {
        com.backyardbrains.utils.LogUtils.LOGE(com.backyardbrains.audio.MicListener.TAG, ("Caught Illegal State Exception: " + (e.toString())));
    }
    recorder = null;
    com.backyardbrains.utils.LogUtils.LOGD(com.backyardbrains.audio.MicListener.TAG, "Recorder Released");
}