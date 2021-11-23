private void showAudioControlsForced() {
    if ((areAudioControlsAvailable()) && (!(audioControls.isShowing()))) {
        audioControls.show();
    }
}