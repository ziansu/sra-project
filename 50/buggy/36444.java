private void syncDownloadSuccessfully() {
    updateDataViews();
    getView().showSyncDownloadSuccessMessage();
    getView().hideSyncProgressDialog();
    getView().enableSyncButton();
}