public int getScannedCount(java.lang.String sdetails) {
    java.lang.String query = ((((("SELECT * FROM " + (android.internest.com.internest.MyDBHandler.TABLE_SCANNED)) + " WHERE ") + (android.internest.com.internest.MyDBHandler.SCANNED_COLUMN_DETAILS)) + " = \'") + sdetails) + "\';";
    if ((db) == null) {
        db = getReadableDatabase();
    }
    android.database.Cursor c = db.rawQuery(query, null);
    try {
        return c.getCount();
    } finally {
        c.close();
    }
}