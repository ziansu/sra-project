@java.lang.Override
public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONObject response) {
    com.codepath.apps.restclienttemplate.models.User user = null;
    try {
        user = com.codepath.apps.restclienttemplate.models.User.fromJSON(response);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    getSupportActionBar().setTitle(user.screenName);
    populateUserHeadline(user);
}