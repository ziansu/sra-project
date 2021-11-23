public void addFeed(java.lang.String type, int amt) {
    type = type.toLowerCase();
    java.lang.System.out.println(feed.get(type));
    feed.put(type, ((feed.get(type)) + amt));
}