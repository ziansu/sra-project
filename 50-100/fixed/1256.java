synchronized long getEventCount() {
    long numberRows = 0;
    android.database.sqlite.SQLiteStatement statement = null;
    try {
        android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
        java.lang.String query = "SELECT COUNT(*) FROM " + (com.amplitude.api.DatabaseHelper.EVENT_TABLE_NAME);
        statement = db.compileStatement(query);
        numberRows = statement.simpleQueryForLong();
    } catch (android.database.sqlite.SQLiteException e) {
        android.util.Log.e(com.amplitude.api.DatabaseHelper.TAG, "getNumberRows failed", e);
    } finally {
        if (statement != null) {
            statement.close();
        }
        close();
    }
    return numberRows;
}