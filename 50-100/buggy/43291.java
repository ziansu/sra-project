@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (ComposeActivity.REQUEST_CODE)) {
        com.codepath.apps.twitterclient.models.Tweet tweet = ((com.codepath.apps.twitterclient.models.Tweet) (data.getParcelableExtra("tweet")));
        tweetAdapter.insert(tweet, 0);
        tweetAdapter.notifyDataSetChanged();
    }
}