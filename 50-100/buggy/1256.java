synchronized long getEventCount() {
    long numberRows = 0;
    try {
        android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
        java.lang.String query = "SELECT COUNT(*) FROM " + (com.amplitude.api.DatabaseHelper.EVENT_TABLE_NAME);
        android.database.sqlite.SQLiteStatement statement = db.compileStatement(query);
        numberRows = statement.simpleQueryForLong();
    } catch (android.database.sqlite.SQLiteException e) {
        android.util.Log.e(com.amplitude.api.DatabaseHelper.TAG, "getNumberRows failed", e);
    } finally {
        close();
    }
    return numberRows;
}