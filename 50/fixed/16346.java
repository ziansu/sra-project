public android.database.Cursor getEntry(java.lang.String query) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.database.Cursor res = db.rawQuery(query, null);
    return res;
}