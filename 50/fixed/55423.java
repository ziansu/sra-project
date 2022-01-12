private void stop() {
    stopProgress();
    audioState = pl.cprojekt.cpaudiopreview.CPAudio.AUDIO_STATE.STOPPED;
    mp.stop();
    setProgress(progressStartPos);
    showPlay();
}