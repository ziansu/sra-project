private synchronized void loadFirstFeed() {
    loadFeed(streamUrl);
    final de.qyotta.eventstore.model.Link last = find(Link.LAST, currentLinks);
    if (last != null) {
        loadFeed(last.getUri());
    }
}