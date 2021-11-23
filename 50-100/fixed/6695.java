public android.database.Cursor getAllNotes(java.lang.String sortOrder) {
    android.database.Cursor cursor = null;
    if (sortOrder == "date") {
        cursor = mDb.query(NotesContract.TABLE_NAME, null, null, null, null, null, ((NotesContract.COLUMN_DATE) + " DESC"));
    }else
        if (sortOrder == "fav") {
            cursor = mDb.query(NotesContract.TABLE_NAME, null, null, null, null, null, ((NotesContract.COLUMN_FAV) + " DESC"));
        }
    
    return cursor;
}