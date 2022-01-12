public twitter4j.Twitter getTwitterInstance() {
    if ((consumerKey) == null) {
        getCredentials();
    }
    twitter4j.conf.ConfigurationBuilder cb = new twitter4j.conf.ConfigurationBuilder();
    cb.setDebugEnabled(true).setOAuthConsumerKey(consumerKey).setOAuthConsumerSecret(consumerSecret).setOAuthAccessToken(accessToken).setOAuthAccessTokenSecret(accessTokenSecret);
    twitter4j.TwitterFactory tf = new twitter4j.TwitterFactory(cb.build());
    return tf.getInstance();
}