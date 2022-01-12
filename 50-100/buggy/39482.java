public void ensureDataOnFileSystem(java.lang.String dataSourcePath, java.lang.String fsPrefix, com.teradata.tempto.fulfillment.table.hive.HiveDataSource dataSource) {
    if (isDataUpToDate(dataSourcePath, dataSource)) {
        return ;
    }
    java.lang.String path = dataSourcePath.replace(fsPrefix, "");
    revisionStorage.remove(path);
    fsClient.deleteDirectory(path);
    fsClient.createDirectory(path);
    storeTableFiles(path, dataSource);
    revisionStorage.put(path, dataSource.revisionMarker());
}