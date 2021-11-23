public void deleteAllS2hasilenkripsi() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL(("delete from " + (database.DatabaseHandler.TABLE_S2HASILENKRIPSI)));
    db.close();
}