@java.lang.Override
boolean isSyncRequired(android.content.Context context) {
    long syncInterval = context.getResources().getInteger(R.integer.projects_sync_interval);
    long lastSync = com.jbirdvegas.mgerrit.database.SyncTime.getValueForQuery(context, SyncTime.PROJECTS_LIST_SYNC_TIME, mUrl);
    boolean sync = isInSyncInterval(syncInterval, lastSync);
    if (sync)
        return true;
    
    return com.jbirdvegas.mgerrit.database.DatabaseTable.isEmpty(context, ProjectsTable.CONTENT_URI);
}