@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody, java.lang.Throwable e) {
    closeLoadingDialog();
    android.util.Log.e(LOG_TAG, java.lang.String.format(java.util.Locale.US, "Return Status Code: %d", statusCode));
    android.util.Log.e(LOG_TAG, e.getMessage(), e);
    android.util.Log.e(LOG_TAG, ("response body : " + (new java.lang.String(responseBody))));
}