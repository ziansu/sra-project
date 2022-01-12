public java.lang.Boolean insertNewRowToTable(java.lang.String conversationName) {
    db = dbHelper.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(Constants.COLUMN_CONVERSATION_NAME, conversationName);
    try {
        db.insertOrThrow(Constants.CONVERSATIONS_TABLE_NAME, null, values);
    } catch (java.sql.SQLException $missing$) {
        android.util.Log.e("InsertNewRowToTable", "Insert new row failed!");
        db.close();
        return false;
    }
    db.close();
    return true;
}