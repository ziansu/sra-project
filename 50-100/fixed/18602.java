public java.lang.Boolean insertNewRowToTable(java.lang.String conversationName) {
    db = dbHelper.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(Constants.COLUMN_CONVERSATION_NAME, conversationName);
    db.insertOrThrow(Constants.CONVERSATIONS_TABLE_NAME, null, values);
    db.close();
    return true;
}