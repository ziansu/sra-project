@java.lang.Override
protected void getOlderTweets(com.elanelango.apps.twitterjoy.TwitterClient.TweetsListener listener) {
    com.elanelango.apps.twitterjoy.models.Tweet tweet = tweetsAdapter.getLastTweet();
    long lastTweetId = (tweet != null) ? tweet.getId() : 1;
    client.getMentions(0, (lastTweetId - 1), listener);
}