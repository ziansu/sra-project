public void addFeed(java.lang.String type, int amt) {
    type = type.toLowerCase();
    feed.put(type, ((feed.get(type)) + amt));
}