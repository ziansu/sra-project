private void requestToGetNotificationList() {
    com.app.lifeshare.Utils.CommonUtils.showLoadingDialog(this, getString(R.string.loading_text), false);
    com.app.lifeshare.Utils.StorageUtils storageUtils = com.app.lifeshare.Utils.StorageUtils.getInstance(this);
    java.lang.String userId = storageUtils.getUserId();
    android.os.Bundle params = new android.os.Bundle();
    params.putString(APIURL.USERID, "41");
    com.app.lifeshare.Utils.JSONPostRequestResponse jsonPostRequestResponse = new com.app.lifeshare.Utils.JSONPostRequestResponse();
    jsonPostRequestResponse.postJsonData(APIURL.URL_GET_NOTIFICATION_LIST, APIURL.REQ_NOTIFICATION_LIST, this, params, this);
}