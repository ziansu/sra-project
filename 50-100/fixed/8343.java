public boolean checkLastUpdate(T e) {
    try {
        java.sql.Timestamp databaseDate = this.getById(e.getId()).getLastUpdate();
        if (databaseDate.before(e.getLastUpdate())) {
            return true;
        }
        return false;
    } catch (com.couchbase.client.core.BucketClosedException ex) {
        connect();
    }
    return false;
}