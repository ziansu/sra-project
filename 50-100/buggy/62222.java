public int findViewVersion(@javax.annotation.Nonnull
org.dbtools.android.domain.AndroidDatabase androidDatabase) {
    createMetaTableIfNotExists(androidDatabase);
    java.lang.String[] selectionArgs = new java.lang.String[]{ getViewVersionKey(androidDatabase) };
    return org.dbtools.android.domain.AndroidBaseManager.findValueByRawQuery(androidDatabase.getDatabaseWrapper(), java.lang.Integer.class, org.dbtools.android.domain.AndroidDatabaseBaseManager.FIND_VERSION, selectionArgs, 0);
}