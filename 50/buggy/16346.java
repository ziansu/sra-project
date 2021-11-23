public android.database.Cursor getEntry(java.lang.String query) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.database.Cursor res = db.rawQuery(("select * from " + (org.x.cassini.DatabaseHelper.TABLE_ENTRY_NAME)), null);
    return res;
}