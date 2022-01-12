public java.util.List<java.lang.String> getAppActvNames() {
    java.util.List<java.lang.String> actvnames = new java.util.ArrayList<>();
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.query(com.quaap.launchtime.db.DB.APP_TABLE, new java.lang.String[]{ com.quaap.launchtime.db.DB.ACTVNAME }, null, null, null, null, com.quaap.launchtime.db.DB.LABEL);
    try {
        while (cursor.moveToNext()) {
            actvnames.add(cursor.getString(0));
        } 
    } finally {
        cursor.close();
    }
    return actvnames;
}