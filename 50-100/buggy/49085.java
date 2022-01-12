@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] errorResponse, java.lang.Throwable e) {
    android.util.Log.e(LOG_TAG, ((("Error code : " + statusCode) + ", ") + (e.getMessage())), e);
    closeLoadingDialog();
}