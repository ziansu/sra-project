public void saveDirents(java.lang.String repoID, java.lang.String path, java.lang.String dirID) {
    removeCachedDirents(repoID, path);
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.seafile.seadroid2.data.DatabaseHelper.DIRENTS_CACHE_COLUMN_REPO_ID, repoID);
    values.put(com.seafile.seadroid2.data.DatabaseHelper.DIRENTS_CACHE_COLUMN_PATH, path);
    values.put(com.seafile.seadroid2.data.DatabaseHelper.DIRENTS_CACHE_COLUMN_DIR_ID, dirID);
    database.insert(com.seafile.seadroid2.data.DatabaseHelper.DIRENTS_CACHE_TABLE_NAME, null, values);
}