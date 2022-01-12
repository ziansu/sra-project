public com.trcgames.dbSynchronizer.database.DBFolder getDBFolder(java.lang.String key) {
    com.trcgames.dbSynchronizer.database.DBFolder folder = ((com.trcgames.dbSynchronizer.database.DBFolder) (getData(key, com.trcgames.dbSynchronizer.database.DBFolder.class, null)));
    if (folder == null) {
        folder = new com.trcgames.dbSynchronizer.database.DBFolder(modID, name, this, null);
        keysArray.add(key);
        dataArray.add(folder);
        dataModified("set", "DBFolder", key, "");
    }
    return folder;
}