public void addToInstanceList(java.util.ArrayList<TweetVector> tweetVectors) {
    for (int i = 0; i < (tweetVectors.size()); i++) {
        TweetVector currentTweet = tweetVectors.get(i);
        addToInstanceList(currentTweet.getFeatures(), currentTweet.getName(), currentTweet.getLabel());
    }
}