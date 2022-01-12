public void addEntry(org.wso2.androidtv.agent.cache.CacheEntry entry) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(DBHelper.CACHE_TABLE_ID, ((org.wso2.androidtv.agent.cache.CacheDAO.AUTO_INCREMENT_ID)++));
    values.put(DBHelper.CACHE_TABLE_TOPIC, entry.getTopic());
    values.put(DBHelper.CACHE_TABLE_MESSAGE, entry.getMessage());
    values.put(DBHelper.CACHE_TABLE_RECEIVED_TIME, getCurrentTime());
    db.insert(DBHelper.CACHE_TABLE_NAME, null, values);
}