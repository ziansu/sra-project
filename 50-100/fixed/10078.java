public java.lang.String getCategoryDisplay(java.lang.String catID) {
    java.lang.String display = null;
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.query(com.quaap.launchtime.db.DB.TAB_ORDER_TABLE, new java.lang.String[]{ com.quaap.launchtime.db.DB.LABEL }, ((com.quaap.launchtime.db.DB.CATID) + "=?"), new java.lang.String[]{ catID }, null, null, null, null);
    try {
        if (cursor.moveToNext()) {
            display = cursor.getString(0);
        }
    } finally {
        cursor.close();
    }
    return display;
}