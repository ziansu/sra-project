@java.lang.Override
public void onSuccess(org.esn.mobilit.models.RSS.RSS feed) {
    org.esn.mobilit.utils.parser.RSSFeedParser rssFeedParser = ((getFromCache()) != null) ? getFromCache() : new org.esn.mobilit.utils.parser.RSSFeedParser();
    rssFeedParser = rssFeedParser.addItems(feed);
    setFeed(rssFeedParser);
    setFeedToCache(rssFeedParser);
    callback.onSuccess(rssFeedParser);
}