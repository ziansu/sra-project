private long getLatestTweetIdFromDatabase() {
    ca.owenpeterson.twittegorize.models.Tweet latestTweet = tweetManager.getLatestTweet();
    if (null != latestTweet) {
        latestTweetId = latestTweet.getTweetId();
    }
    return latestTweetId;
}