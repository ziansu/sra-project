@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    ca.owenpeterson.twittegorize.models.Tweet selectedTweet = tweets.get(position);
    long tweetId = selectedTweet.getTweetId();
    android.content.Intent intent = new android.content.Intent(getActivity(), ca.owenpeterson.twittegorize.views.activities.TweetDetailsActivity.class);
    intent.putExtra("tweetId", tweetId);
    startActivity(intent);
}