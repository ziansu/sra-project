@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.String responseString, java.lang.Throwable throwable) {
    android.util.Log.e(TAG, responseString);
    listener.sendReportPoliceError();
}