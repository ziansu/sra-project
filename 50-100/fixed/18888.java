public final long delete(T e) {
    try {
        com.couchbase.client.java.document.JsonDocument res = dao.DAOManager.getCurrentBucket().remove(("" + (e.getId())));
        return java.lang.Long.valueOf(res.id());
    } catch (com.couchbase.client.java.error.DocumentDoesNotExistException ex) {
        return -1;
    } catch (com.couchbase.client.core.BucketClosedException ex) {
        connect();
    }
    return -1;
}