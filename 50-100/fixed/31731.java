private void buildChannelsByItem() {
    if (((cache.items.size()) > 0) && ((cache.feeds.size()) > 0)) {
        cache.channelsByItem.clear();
        for (fr.vpm.audiorss.rss.RSSItem item : cache.items) {
            for (fr.vpm.audiorss.rss.RSSChannel channel : cache.feeds) {
                if ((channel.getId()) == (item.getChannelId())) {
                    cache.channelsByItem.put(item, channel);
                }
            }
        }
    }
    refreshView();
}