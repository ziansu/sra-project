private void syncUploadSuccessfully() {
    updateDataViews();
    getView().showSyncUploadSuccessMessage();
    getView().hideSyncProgressDialog();
}