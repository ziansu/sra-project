@java.lang.Override
public void onResponse(okhttp3.Response response) throws java.io.IOException {
    try {
        org.json.JSONObject data = getResponseData(response);
        if (callback != null) {
            callback.done(data);
        }
    } catch (com.emreeran.android.instagram.helpers.ResponseException e) {
        android.util.Log.e(com.emreeran.android.instagram.helpers.TAG, e.getMessage());
    }
}