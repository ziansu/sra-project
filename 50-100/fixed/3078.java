@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    com.twitter.sdk.android.tweetui.SearchTimeline timeline = new com.twitter.sdk.android.tweetui.SearchTimeline.Builder().query(query).build();
    com.twitter.sdk.android.tweetui.TweetTimelineListAdapter adapter = new com.twitter.sdk.android.tweetui.TweetTimelineListAdapter.Builder(this).setTimeline(timeline).build();
    binding.list.setAdapter(adapter);
    searchView.clearFocus();
    return false;
}