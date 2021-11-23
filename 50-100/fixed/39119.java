@java.lang.Override
public java.lang.String getLatestTweet(java.lang.String userName) {
    try {
        org.telegram.services.Query query = new org.telegram.services.Query(("from:" + userName));
        org.telegram.services.QueryResult result = twitter.search(query);
        return result.getTweets().get(0).getText();
    } catch (org.telegram.services.TwitterException ex) {
        return "No twits for you bro :(";
    }
}