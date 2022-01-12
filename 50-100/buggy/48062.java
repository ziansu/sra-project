public internetofeveryone.ioe.Data.Website getDefaultWebsiteByURL(java.lang.String url) {
    android.database.Cursor cursor = sql.query(TableData.DefaultWebsites.TABLE_DEFAULT, defaultColumns, ((TableData.DefaultWebsites.COLUMN_DEFAULT_URL) + " = ?"), new java.lang.String[]{ url }, null, null, null);
    if (cursor != null) {
        if (!(cursor.moveToFirst())) {
            return null;
        }
    }
    internetofeveryone.ioe.Data.Website website = cursorToWebsite(cursor);
    cursor.close();
    return website;
}