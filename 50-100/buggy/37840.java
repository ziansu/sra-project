public void deleteAll(java.lang.String table) {
    android.database.Cursor c = getAllRows(table);
    long rowId = c.getColumnIndexOrThrow(cse2016.in.ac.nitrkl.chatbot.DBAdapter.KEY_ROWID);
    if (c.moveToFirst()) {
        do {
            deleteRow(table, c.getLong(((int) (rowId))));
        } while (c.moveToNext() );
    }
    c.close();
}