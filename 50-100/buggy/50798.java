public java.lang.String getValue(java.lang.String key) {
    db = this.getReadableDatabase();
    android.database.Cursor c = db.query(com.antest1.kcanotify.KcaDBHelper.table_name, null, "KEY=?", new java.lang.String[]{ key }, null, null, null, null);
    if (c.moveToFirst()) {
        return c.getString(c.getColumnIndex("VALUE"));
    }else {
        return null;
    }
}