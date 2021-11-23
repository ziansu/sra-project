@java.lang.Override
public void deleteAsync(com.orangerhymelabs.helenus.persistence.Identifier id, com.google.common.util.concurrent.FutureCallback<com.orangerhymelabs.helenus.cassandra.index.Index> callback) {
    try {
        com.orangerhymelabs.helenus.cassandra.index.IndexRepository.BUCKETED_VIEW_SCHEMA.drop(session(), keyspace(), id.toDbName());
        super.deleteAsync(id, callback);
    } catch (com.datastax.driver.core.exceptions.AlreadyExistsException e) {
        callback.onFailure(new com.orangerhymelabs.helenus.exception.ItemNotFoundException(e));
    } catch (java.lang.Exception e) {
        callback.onFailure(new com.orangerhymelabs.helenus.exception.StorageException(e));
    }
}