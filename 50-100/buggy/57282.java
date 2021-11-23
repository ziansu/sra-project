public void incrementFreq(int position) {
    int freq = getFreq(position);
    db = dbHelper.getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(AllSongsEntry.COLUMN_NAME_FREQUENCY, (freq++));
    db.update(AllSongsEntry.TABLE_NAME, contentValues, ((AllSongsEntry.COLUMN_NAME_TRACKNUMBER) + " = ?"), new java.lang.String[]{ java.lang.String.valueOf(position) });
    db.close();
}