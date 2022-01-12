public int getNodeCount() {
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(("SELECT * FROM " + (io.github.data4all.model.DataBaseHandler.TABLE_NODE)), null);
    int count = cursor.getCount();
    cursor.close();
    db.close();
    return count;
}