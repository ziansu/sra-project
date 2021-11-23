private void stop() {
    android.util.Log.i("X", "ctrl STOP");
    stopProgress();
    audioState = pl.cprojekt.cpaudiopreview.CPAudio.AUDIO_STATE.STOPPED;
    mp.stop();
    setProgress(progressStartPos);
    showPlay();
}