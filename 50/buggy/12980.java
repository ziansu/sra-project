public static void send(java.lang.String url) {
    HTMLGetter.url = url;
    try {
        TwitterManager.sendTweet();
    } catch (twitter4j.TwitterException e) {
        e.printStackTrace();
    }
}