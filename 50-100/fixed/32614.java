@ch.ralscha.extdirectspring.annotation.ExtDirectMethod(value = ch.ralscha.extdirectspring.annotation.ExtDirectMethodType.STORE_READ, group = "feed")
public java.util.List<ch.rasc.extdirectspring.demo.feed.FeedItem> readFeedItem(java.lang.String feedUrl) throws java.net.MalformedURLException {
    com.rometools.fetcher.impl.SyndFeedInfo info = this.feedCache.getFeedInfo(feedUrl);
    java.util.List<ch.rasc.extdirectspring.demo.feed.FeedItem> items = new java.util.ArrayList<>();
    int id = 0;
    if ((info.getSyndFeed()) != null) {
        for (com.rometools.rome.feed.synd.SyndEntry entry : info.getSyndFeed().getEntries()) {
            ch.rasc.extdirectspring.demo.feed.FeedItem item = new ch.rasc.extdirectspring.demo.feed.FeedItem((id++), entry);
            items.add(item);
        }
    }
    return items;
}