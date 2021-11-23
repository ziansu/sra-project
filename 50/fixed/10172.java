private void applicationStartedUploading() {
    gui.startCompetitionUploadButton.setEnabled(false);
    gui.stopCompetitionUploadButton.setEnabled(true);
    startUploadTimer();
}