public android.database.Cursor returnedARowWithTheSameName(java.lang.String name) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    return db.query(com.ab.piggybank.DatabaseHelper.TABLENAME_5, new java.lang.String[]{ com.ab.piggybank.DatabaseHelper.COLUMN_ID , com.ab.piggybank.DatabaseHelper.COLUMN_RELATIONSHIP_NAME }, ((((com.ab.piggybank.DatabaseHelper.COLUMN_RELATIONSHIP_NAME) + " = '") + name) + "'"), null, null, null, null);
}