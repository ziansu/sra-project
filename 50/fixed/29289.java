private void resetDatabase() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL(createPersonTable);
    db.execSQL(createPersonWordTable);
    db.close();
}