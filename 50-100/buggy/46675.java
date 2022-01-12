public int getLabelsCount() {
    java.lang.String Query = "SELECT  * FROM " + (app.sourabhlal.filter.DBHelper.Table_Labels);
    android.database.Cursor c = this.getReadableDatabase().rawQuery(Query, null);
    c.close();
    int count = c.getCount();
    return count;
    java.lang.String countQuery = "SELECT  * FROM " + (app.sourabhlal.filter.DBHelper.Table_Labels);
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(countQuery, null);
    cursor.close();
    return cursor.getCount();
}