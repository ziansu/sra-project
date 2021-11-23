@java.lang.Override
public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONObject response) {
    com.codepath.apps.mysimpletweet.models.Tweet tweet = new com.codepath.apps.mysimpletweet.models.Tweet(response);
    tweet.save();
    tweet.getUser().save();
    if ((listener) != null) {
        listener.onCreateSuccess(tweet.getId());
        dismiss();
    }
}