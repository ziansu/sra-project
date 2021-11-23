public void clearTable() {
    db = getWritableDatabase();
    db.execSQL((("delete from " + (com.example.sqlite.DBHelper.TABLE_NAME)) + ";"));
}