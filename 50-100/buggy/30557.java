private synchronized void onNewSubscriptionListReceived(final java.util.HashSet<java.lang.String> newSubscriptions, final long timestamp) {
    pendingSubscriptions.clear();
    pendingUnsubscriptions.clear();
    subscriptions = new org.quantumbadger.redreader.io.WritableHashSet(newSubscriptions, timestamp, user.getCanonicalUsername());
    org.quantumbadger.redreader.reddit.api.RedditSubredditSubscriptionManager.db.put(subscriptions);
    org.quantumbadger.redreader.reddit.api.RedditSubredditSubscriptionManager.addToHistory(newSubscriptions);
    listeners.map(notifier, org.quantumbadger.redreader.reddit.api.RedditSubredditSubscriptionManager.SubredditSubscriptionChangeType.LIST_UPDATED);
}