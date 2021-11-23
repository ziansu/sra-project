public static java.lang.String addFeed(java.lang.String feed) {
    try {
        java.util.Set<java.lang.String> feeds = feedblender.utils.FeedStorage.getFeeds();
        feeds.add(feed);
        feedblender.utils.FeedStorage.prefs.put(feedblender.utils.FeedStorage.PREFS_FEED_URL, feedblender.utils.FeedStorage.gson.toJson(feeds));
        feedblender.utils.FeedStorage.prefs.sync();
        return feed;
    } catch (java.lang.Exception ex) {
        throw new java.lang.IllegalStateException("Could not save preferences", ex);
    }
}