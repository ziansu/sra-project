public boolean containsId(java.lang.String id) {
    com.conveyal.gtfs.GTFSFeed feed = null;
    try {
        feed = cache.get(id);
    } catch (java.lang.Exception e) {
        return false;
    }
    return feed != null;
}