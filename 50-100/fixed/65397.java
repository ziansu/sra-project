private void dropPartition(java.lang.String databaseName, java.lang.String tableName, java.lang.String partitionName) {
    if ((partitions.containsKey(tableName)) && (!(partitions.get(tableName).containsKey(partitionName)))) {
        throw new org.apache.tajo.catalog.store.NoSuchPartitionException(databaseName, tableName, partitionName);
    }else {
        partitions.get(tableName).remove(partitionName);
    }
}