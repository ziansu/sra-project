private void RequestToUpdateLatLong() {
    com.app.lifeshare.Utils.LogUtils.showErrorLog("RequestToUpdateLatLong");
    android.os.Bundle params = new android.os.Bundle();
    com.app.lifeshare.Utils.StorageUtils storageUtils = com.app.lifeshare.Utils.StorageUtils.getInstance(getApplicationContext());
    params.putDouble(APIURL.LONGITUDE, storageUtils.getUserLongitude());
    params.putDouble(APIURL.LATITUDE, storageUtils.getUserLattitude());
    params.putString(APIURL.USERID, storageUtils.getUserId());
    com.app.lifeshare.Utils.JSONPostRequestResponse jsonPostRequestResponse = new com.app.lifeshare.Utils.JSONPostRequestResponse();
    jsonPostRequestResponse.postJsonData(APIURL.URL_UPDATE_USER_DETAILS, APIURL.REQ_UPDATE_USER_DETAILS_CODE, this, params, getApplicationContext());
}