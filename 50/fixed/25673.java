private void applicationStoppedUploading() {
    gui.startCompetitionUploadButton.setEnabled(true);
    gui.stopCompetitionUploadButton.setEnabled(false);
    stopUploadTimer();
}