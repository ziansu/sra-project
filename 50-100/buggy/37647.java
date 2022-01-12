public int getPostsCount() {
    java.lang.String query = ("SELECT * FROM " + (android.internest.com.internest.MyDBHandler.TABLE_POST)) + ";";
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor c = db.rawQuery(query, null);
    try {
        return c.getCount();
    } finally {
        c.close();
        db.close();
    }
}