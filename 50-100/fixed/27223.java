public com.maxibi.testing.Word getWord(java.lang.String w) {
    int temp = 0;
    com.maxibi.testing.Word word = null;
    java.lang.String query = ("SELECT * FROM quotes WHERE bm = '" + w) + "'";
    android.database.Cursor cursor = sqlDatabase.rawQuery(query, null);
    if (cursor.moveToFirst()) {
        word = new com.maxibi.testing.Word(cursor.getString(cursor.getColumnIndex("bm")), cursor.getString(cursor.getColumnIndex("bi")), temp);
        temp++;
    }
    return word;
}