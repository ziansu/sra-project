public java.lang.String getValue(java.lang.String key) {
    java.lang.String value = null;
    db = this.getReadableDatabase();
    android.database.Cursor c = db.query(com.antest1.kcanotify.KcaDBHelper.table_name, null, "KEY=?", new java.lang.String[]{ key }, null, null, null, null);
    if (c.moveToFirst())
        value = c.getString(c.getColumnIndex("VALUE"));
    
    return value;
}