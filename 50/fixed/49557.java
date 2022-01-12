@java.lang.Override
public void onSuccess(com.datastax.driver.core.ResultSet rs) {
    if (com.kryptnostic.datastore.util.Util.wasLightweightTransactionApplied(rs)) {
        putVertexIfAbsentAsync();
        putVertexLookup = true;
    }else {
        id = com.kryptnostic.datastore.cassandra.RowAdapters.vertexId(rs.one());
        isDone = true;
    }
}