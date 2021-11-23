public void deleteAll() {
    android.database.Cursor c = getAllRows();
    long rowId = c.getColumnIndexOrThrow(cse2016.in.ac.nitrkl.chatbot.DBAdapter.KEY_ROWID);
    if (c.moveToFirst()) {
        do {
            deleteRow(c.getLong(((int) (rowId))));
        } while (c.moveToNext() );
    }
    c.close();
}