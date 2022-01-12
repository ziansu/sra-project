private void postConstruct() {
    this.initManager();
    this.initControls();
    this.initItems();
    this.handleFilesAdded();
    this.handleFilesRemoved();
    this.handleUploadStart();
    this.handleUploadStop();
    this.handleUploadProgress();
    this.handleFileUploaded();
    this.handleUploadComplete();
    this.handleStartButtonClick();
    this.handleStopButtonClick();
}