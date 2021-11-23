private org.aauc.urticariapp.data.LogItem findOrCreateLogItem(java.util.Calendar when) {
    android.database.Cursor cursor = getReadableDatabase().query(org.aauc.urticariapp.data.LogItemOpenHelper.LOG_ITEM_TABLE_NAME, org.aauc.urticariapp.data.LogItemOpenHelper.ALL_FIELDS, ((org.aauc.urticariapp.data.LogItemOpenHelper.DATE) + " = ?"), new java.lang.String[]{ encodeDate(when) }, null, null, null);
    org.aauc.urticariapp.data.LogItem item;
    if (cursor.moveToFirst()) {
        item = createLogItem(cursor);
    }else {
        item = new org.aauc.urticariapp.data.LogItem(when);
    }
    item.setHelper(this);
    return item;
}