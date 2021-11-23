private org.apache.atlas.typesystem.Referenceable registerDatabase(java.lang.String databaseName) throws java.lang.Exception {
    org.apache.atlas.typesystem.Referenceable dbRef = getDatabaseReference(clusterName, databaseName);
    org.apache.hadoop.hive.metastore.api.Database db = hiveClient.getDatabase(databaseName);
    if (db != null) {
        if (dbRef == null) {
            dbRef = createDBInstance(db);
            dbRef = registerInstance(dbRef);
        }else {
            org.apache.atlas.hive.bridge.HiveMetaStoreBridge.LOG.info("Database {} is already registered with id {}. Updating it.", databaseName, dbRef.getId().id);
            dbRef = createOrUpdateDBInstance(db, dbRef);
            updateInstance(dbRef);
        }
    }
    return dbRef;
}