private static com.codepath.apps.MySimpleTweets.models.Tweet saveIfNewTweet(com.codepath.apps.MySimpleTweets.models.Tweet tweet) {
    com.codepath.apps.MySimpleTweets.models.Tweet existingTweet = new com.activeandroid.query.Select().from(com.codepath.apps.MySimpleTweets.models.Tweet.class).where("uid= ?", tweet.uid).executeSingle();
    if (existingTweet != null) {
        return existingTweet;
    }
    tweet.save();
    return tweet;
}