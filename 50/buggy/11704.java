@java.lang.Override
public void onSuccess(int statusCode, org.apache.http.Header[] headers, org.json.JSONObject jsonObject) {
    android.content.Intent intent = new android.content.Intent(this, com.codepath.apps.twitterzzz.activities.TimelineActivity.class);
    intent.putExtra("newTweet", newTweetContent);
    startActivity(intent);
}