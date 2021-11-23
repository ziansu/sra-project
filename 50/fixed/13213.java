private android.database.Cursor getAllUsers() {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    return db.query("USER", null, null, null, null, null, null);
}