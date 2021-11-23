public java.lang.String getPopularArticleId(int id) {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.query(martell.com.vice.dbHelper.NotificationDBHelper.ARTICLES_TABLE_NAME, new java.lang.String[]{ martell.com.vice.dbHelper.NotificationDBHelper.COL_ARTICLE_ID }, ((martell.com.vice.dbHelper.NotificationDBHelper.COL_ID) + " = ?"), new java.lang.String[]{ java.lang.String.valueOf(id) }, null, null, null, null);
    if (cursor.moveToFirst()) {
        return cursor.getString(cursor.getColumnIndex(martell.com.vice.dbHelper.NotificationDBHelper.COL_ARTICLE_ID));
    }else {
        return null;
    }
}