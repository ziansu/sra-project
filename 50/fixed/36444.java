private void syncDownloadSuccessfully() {
    if ((getView()) != null) {
        updateDataViews();
        getView().showSyncDownloadSuccessMessage();
        getView().hideSyncProgressDialog();
        getView().enableSyncButton();
    }
}