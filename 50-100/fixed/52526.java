public int lastSeqNumberOfChain(java.lang.String owner) {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    try (android.database.Cursor c = db.query(nl.tudelft.b_b_w.model.AbstractDatabaseHandler.TABLE_NAME, new java.lang.String[]{ ("MAX(" + (nl.tudelft.b_b_w.model.AbstractDatabaseHandler.KEY_SEQ_NO)) + ")" }, ((nl.tudelft.b_b_w.model.AbstractDatabaseHandler.KEY_OWNER) + " = ? "), new java.lang.String[]{ owner }, null, null, null, null)) {
        c.moveToFirst();
        return c.getInt(0);
    }
}