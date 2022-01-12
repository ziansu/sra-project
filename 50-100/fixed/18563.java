public void processTweet(Tweet tweet) {
    long timeDif = tweet.timeBetween(latest);
    if (timeDif > 0) {
        latest = new java.util.Date(tweet.getTimestamp().getTime());
        removeOldEdges();
    }
    if ((timeDif < (window)) || ((tweet.getHashtags().length) < 2))
        return ;
    
    addEdges(tweet.getHashtags(), tweet.getTimestamp());
}