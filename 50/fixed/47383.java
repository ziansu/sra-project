private void syncUploadSuccessfully() {
    if ((getView()) != null) {
        updateDataViews();
        getView().showSyncUploadSuccessMessage();
        getView().hideSyncProgressDialog();
    }
}