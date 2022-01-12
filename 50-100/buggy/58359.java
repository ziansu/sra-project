public void addToInstanceList(TweetVector[] tweetVectors) {
    for (int i = 0; i < (tweetVectors.length); i++) {
        TweetVector currentTweet = tweetVectors[i];
        addToInstanceList(currentTweet.getFeatures(), currentTweet.getName(), currentTweet.getLabel());
    }
}