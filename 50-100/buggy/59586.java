public android.database.Cursor getWordByC_id(java.lang.Integer c_id1) {
    java.lang.Integer c_id = c_id1;
    java.lang.String query = "SELECT chin_word,tone FROM CHAR_TABLE WHERE CHAR_TABLE.c_id = " + c_id1;
    android.database.Cursor cursor = mDb.rawQuery(query, null);
    cursor.moveToFirst();
    if (cursor != null) {
        cursor.moveToNext();
    }
    return cursor;
}