public void insertArticles(int id, int articleId, java.lang.String articleTitle, java.lang.String articleCategory, java.lang.String articleTimeStamp) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(martell.com.vice.dbHelper.NotificationDBHelper.COL_ID, id);
    values.put(martell.com.vice.dbHelper.NotificationDBHelper.COL_ARTICLE_ID, articleId);
    values.put(martell.com.vice.dbHelper.NotificationDBHelper.COL_ARTICLE_NAME, articleTitle);
    values.put(martell.com.vice.dbHelper.NotificationDBHelper.COL_ARTICLE_CATEGORY, articleCategory);
    values.put(martell.com.vice.dbHelper.NotificationDBHelper.COL_ARTICLE_TIMESTAMP, articleTimeStamp);
    db.insert(martell.com.vice.dbHelper.NotificationDBHelper.ARTICLES_TABLE_NAME, null, values);
}