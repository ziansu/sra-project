protected internetofeveryone.ioe.Data.Message cursorToMessage(android.database.Cursor cursor) {
    internetofeveryone.ioe.Data.Message msg = new internetofeveryone.ioe.Data.Message(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), java.lang.Boolean.valueOf(cursor.getString(4)), getUserCode());
    return msg;
}