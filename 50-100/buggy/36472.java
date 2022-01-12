public android.database.Cursor getInformations(java.lang.String email, java.lang.String password) {
    final android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    java.lang.String[] columns = new java.lang.String[]{ com.modSys.database.Database.USERID , com.modSys.database.Database.EMAIL , com.modSys.database.Database.NAME , com.modSys.database.Database.PASSWORD };
    android.database.Cursor cursor = db.query(com.modSys.database.Database.TABLE_USER, columns, null, null, null, null, null);
    return cursor;
}