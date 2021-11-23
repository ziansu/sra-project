public long updateGame(java.util.ArrayList array, java.lang.String request, int id) {
    android.content.ContentValues initialValues = new android.content.ContentValues();
    initialValues.put(request, convertToString(array));
    return mDb.update(com.example.seth.scorekeeper.ScoreDBAdapter.SQLITE_TABLE, initialValues, (((com.example.seth.scorekeeper.ScoreDBAdapter.KEY_ROWID) + "=") + id), null);
}