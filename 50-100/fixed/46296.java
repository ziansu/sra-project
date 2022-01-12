private final twitter4j.User getUser() {
    try {
        final int idx = checkIndexFromPrefTwtr();
        return getUser(idx, getTwitter(idx, false).getScreenName());
    } catch (java.lang.IllegalStateException e) {
        jp.gr.java_conf.ya.shiobeforandroid3.util.WriteLog.write(context, e);
    } catch (final twitter4j.TwitterException e) {
        twitterException(e);
    } catch (final java.lang.Exception e) {
        jp.gr.java_conf.ya.shiobeforandroid3.util.WriteLog.write(context, e);
    }
    return null;
}