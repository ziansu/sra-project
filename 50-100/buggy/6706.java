@java.lang.Override
public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONObject response) {
    android.util.Log.i("response", response.toString());
    try {
        java.lang.String token = response.getString("access_token").toString();
        com.singh.harsukh.redder.AccessActivity.setToken(token);
        android.util.Log.e("Access_token", token);
    } catch (org.json.JSONException j) {
        j.printStackTrace();
    }
}