public boolean deleteFeed(long feedDatabaseId) {
    boolean returnValue = false;
    try {
        if (databaseReady()) {
            returnValue = (db.delete(DatabaseHelper.FEEDS_TABLE, ((DatabaseHelper.FEEDS_TABLE_COLUMN_ID) + "=?"), new java.lang.String[]{ java.lang.String.valueOf(feedDatabaseId) })) > 0;
            if (returnValue) {
                cleanupMediaItemsAndFiles(info.guardianproject.securereader.SocialReader.getInstance(null));
            }
        }
    } catch (java.lang.Exception e) {
        if (info.guardianproject.securereader.DatabaseAdapter.LOGGING)
            e.printStackTrace();
        
    }
    return returnValue;
}