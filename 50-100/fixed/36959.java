@java.lang.Override
public void call(java.util.List<com.google.gson.JsonObject> jsonObjects) {
    loadingDialog.dismiss();
    if (((jsonObjects.size()) != 0) && ((getView()) != null)) {
        getView().showSyncProgressDialog("Downloading Cases...Please wait a moment.");
        getView().setProgressMax(jsonObjects.size());
    }
}