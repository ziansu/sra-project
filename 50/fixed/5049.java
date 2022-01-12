@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody, java.lang.Throwable error) {
    android.util.Log.e("Update check", "Couldn't get latest version");
}