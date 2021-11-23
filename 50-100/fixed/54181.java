public static void pull() throws org.json.JSONException {
    chevalierx.kiwapp.models.synchronizer.SynchronizerClient.get("", null, new com.loopj.android.http.JsonHttpResponseHandler() {
        @java.lang.Override
        public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONArray timeline) {
            android.util.Log.w("WARN - SUCCESS", java.lang.Integer.toString(statusCode));
        }

        @java.lang.Override
        public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.String responseString, java.lang.Throwable throwable) {
            android.util.Log.w("WARN - FAILURE", java.lang.Integer.toString(statusCode));
        }
    });
}