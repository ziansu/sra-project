public final java.util.List<T> getAll() {
    try {
        createViewAll();
        java.util.List<dao.ViewRow> result = dao.DAOManager.getCurrentBucket().query(dao.ViewQuery.from("designDoc", ("by_type_" + (type))).stale(Stale.FALSE)).allRows();
        return viewRowsToEntities(result);
    } catch (com.couchbase.client.core.BucketClosedException ex) {
        connect();
    }
    return null;
}