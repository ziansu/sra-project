public int getPostsCount() {
    java.lang.String query = ("SELECT * FROM " + (android.internest.com.internest.MyDBHandler.TABLE_POST)) + ";";
    if ((db) == null) {
        db = getReadableDatabase();
    }
    android.database.Cursor c = db.rawQuery(query, null);
    try {
        return c.getCount();
    } finally {
        c.close();
    }
}