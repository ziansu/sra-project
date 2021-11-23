protected void stopAudioPlayback() {
    if ((audioFocusHelper) != null) {
        audioFocusHelper.abandonFocus();
    }
    if ((audioPlayer) != null) {
        audioPlayer.stop();
        audioPlayer.reset();
    }
}