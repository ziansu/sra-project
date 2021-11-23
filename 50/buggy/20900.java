private void clickModePlayPause() {
    if ((audioState) == (pl.cprojekt.cpaudiopreview.CPAudio.AUDIO_STATE.STARTED)) {
        pause();
        return ;
    }
}