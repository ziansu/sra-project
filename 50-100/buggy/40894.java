@java.lang.Override
protected void onPreExecute() {
    if ((databaseManager) == null) {
        databaseManager = new com.intbridge.projects.gaucholife.PGDatabaseManager();
    }
    if ((tempDataStorage) == null) {
        tempDataStorage = new java.util.LinkedHashMap<>();
    }
    if ((currentDate) == null) {
        currentDate = new java.util.Date();
    }
}