private android.database.Cursor createChoreCursor() {
    com.example.android.familyweeklychoretracker.data.ChoreDbHelper mDbHelper = new com.example.android.familyweeklychoretracker.data.ChoreDbHelper(this);
    android.database.sqlite.SQLiteDatabase db = mDbHelper.getReadableDatabase();
    java.lang.String[] projection = new java.lang.String[]{ com.example.android.familyweeklychoretracker.data.ChoreContract.ChoreEntry.COLUMN_NAME , com.example.android.familyweeklychoretracker.data.ChoreContract.ChoreEntry.COLUMN_WEEK , com.example.android.familyweeklychoretracker.data.ChoreContract.ChoreEntry.COLUMN_CHORE_DONE };
    android.database.Cursor cursor = db.query(ChoreEntry.TABLE_NAME, projection, null, null, null, null, null);
    cursor.close();
    return cursor;
}