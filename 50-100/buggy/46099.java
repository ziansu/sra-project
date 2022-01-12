public int GetUserCategory(android.database.sqlite.SQLiteDatabase db) {
    boolean isExistType = false;
    java.lang.String[] whereArgs = new java.lang.String[]{ java.lang.Integer.toString((-1)) };
    android.database.Cursor cursor = db.query(sph.durga.rCard.db.SQLiteDBHelper.SQLiteDBHelper.TABLE_USER, new java.lang.String[]{ sph.durga.rCard.db.SQLiteDBHelper.SQLiteDBHelper.KEY_CATEGORY }, null, null, null, null, null);
    cursor.moveToFirst();
    int category = cursor.getInt(0);
    cursor.close();
    return category;
}