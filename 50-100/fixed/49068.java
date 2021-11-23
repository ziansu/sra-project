public internetofeveryone.ioe.Data.Message getMessageByID(long id) {
    android.database.Cursor cursor = sql.query(TableData.Messages.TABLE_MESSAGES, messageColumns, ((TableData.Messages.COLUMN_MESSAGES_ID) + " = ?"), new java.lang.String[]{ java.lang.String.valueOf(id) }, null, null, null);
    if (cursor != null) {
        if (!(cursor.moveToFirst())) {
            return null;
        }
    }
    internetofeveryone.ioe.Data.Message msg = cursorToMessage(cursor);
    if (cursor != null) {
        cursor.close();
    }
    return msg;
}