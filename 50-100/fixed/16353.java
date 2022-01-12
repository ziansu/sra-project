@java.lang.Override
public java.lang.Integer getColumnCount(java.lang.String riFullKey) {
    try {
        if (org.ednovo.gooru.cassandra.core.dao.EntityCassandraDaoImpl.isReverseIndexersInstantiated()) {
            return org.ednovo.gooru.cassandra.core.dao.EntityCassandraDaoImpl.getFactory().getKeyspace().prepareQuery(getRiColumnFamily()).getKey(riFullKey).getCount().execute().getResult();
        }else {
            return 0;
        }
    } catch (com.netflix.astyanax.connectionpool.exceptions.ConnectionException e) {
        return 0;
    }
}