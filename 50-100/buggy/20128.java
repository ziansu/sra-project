@java.lang.Override
public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONObject response) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    com.multicoredump.tutorial.plumtwitter.model.Tweet postedTweet = gson.fromJson(response.toString(), com.multicoredump.tutorial.plumtwitter.model.Tweet.class);
    if (postedTweet != null) {
        if ((binding.slidingTabs.getSelectedTabPosition()) == (timelineFragment.getTabPosition())) {
            timelineFragment.insertNewTweet(postedTweet);
        }
    }
}