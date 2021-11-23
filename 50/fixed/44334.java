public void executeAudioCallBack() {
    try {
        this.interpreter.eval(audioCallBack);
    } catch (java.lang.Exception e) {
        au.org.intersect.faims.android.log.FLog.e("error when executing the callback for the audio", e);
    }
}