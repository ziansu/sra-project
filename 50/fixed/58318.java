@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.Throwable throwable, org.json.JSONObject errorResponse) {
    super.onFailure(statusCode, headers, throwable, errorResponse);
    android.widget.Toast.makeText(context, "Unable to retweet", Toast.LENGTH_SHORT).show();
}