public int updateSJ() {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(MotherTB.COLUMN_SJ, MainApp.mc.getsJ());
    values.put(MotherTB.COLUMN_UID, MainApp.mc.getUID());
    java.lang.String selection = (edu.aku.hassannaqvi.dss_census.contracts.MotherContract.MotherTB.COLUMN_ID) + " = ?";
    java.lang.String[] selectionArgs = new java.lang.String[]{ java.lang.String.valueOf(MainApp.mc.get_ID()) };
    int count = db.update(MotherTB.TABLE_NAME, values, selection, selectionArgs);
    return count;
}