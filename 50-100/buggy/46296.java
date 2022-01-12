private final twitter4j.User getUser() {
    final int idx = checkIndexFromPrefTwtr();
    final twitter4j.Twitter twtr = getTwitter(idx, false);
    try {
        return getUser(idx, twtr.getScreenName());
    } catch (java.lang.IllegalStateException e) {
        jp.gr.java_conf.ya.shiobeforandroid3.util.WriteLog.write(context, e);
    } catch (final twitter4j.TwitterException e) {
        twitterException(e);
    }
    return null;
}