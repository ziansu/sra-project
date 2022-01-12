public twitter4j.Twitter cookTwitterInstance() {
    twitter = twitter4j.TwitterFactory.getSingleton();
    twitter.setOAuthConsumer(consumerKey, consumerSecretKey);
    return twitter;
}