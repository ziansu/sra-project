private void showAudioControls() {
    if ((areAudioControlsAvailable()) && (!(audioControls.isShowing()))) {
        audioControls.showAnimated();
    }
}