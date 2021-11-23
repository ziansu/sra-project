public java.sql.Timestamp getLastUpdate(long id) {
    try {
        return this.getById(id).getLastUpdate();
    } catch (com.couchbase.client.core.BucketClosedException e) {
        connect();
    }
    return null;
}