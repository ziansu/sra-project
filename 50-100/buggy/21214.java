public void deleteScanned(java.lang.String id) {
    java.lang.String query = ((((("DELETE FROM " + (android.internest.com.internest.MyDBHandler.TABLE_SCANNED)) + " WHERE ") + (android.internest.com.internest.MyDBHandler.SCANNED_COLUMN_ID)) + " = ") + id) + ";";
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    try {
        db.execSQL(query);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        db.close();
    }
}