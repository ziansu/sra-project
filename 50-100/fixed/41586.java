@javax.annotation.Nullable
@java.lang.Override
public gobblin.data.management.copy.hive.HiveDataset apply(@javax.annotation.Nullable
gobblin.data.management.copy.hive.HiveDatasetFinder.DbAndTable dbAndTable) {
    if (dbAndTable == null) {
        return null;
    }
    try (gobblin.util.AutoReturnableObject<org.apache.hadoop.hive.metastore.IMetaStoreClient> client = clientPool.getClient()) {
        org.apache.hadoop.hive.metastore.api.Table table = client.get().getTable(dbAndTable.getDb(), dbAndTable.getTable());
        return createHiveDataset(table);
    } catch (java.io.IOException | org.apache.thrift.TException ioe) {
        throw new java.lang.RuntimeException(ioe);
    }
}