public void deleteTrend(java.lang.String sdetails) {
    if ((db) == null) {
        db = getWritableDatabase();
    }
    db.delete(android.internest.com.internest.MyDBHandler.TABLE_TRENDS, ((((android.internest.com.internest.MyDBHandler.SCANNED_COLUMN_DETAILS) + " = \'") + sdetails) + "\'"), null);
}