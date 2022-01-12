private static void addToHistory(final org.quantumbadger.redreader.account.RedditAccount account, final java.util.HashSet<java.lang.String> newSubscriptions) {
    for (final java.lang.String sub : newSubscriptions) {
        try {
            org.quantumbadger.redreader.reddit.RedditSubredditHistory.addSubreddit(account.username, sub);
        } catch (org.quantumbadger.redreader.reddit.things.RedditSubreddit e) {
            android.util.Log.e(org.quantumbadger.redreader.reddit.api.RedditSubredditSubscriptionManager.TAG, ("Invalid subreddit name " + sub), e);
        }
    }
}