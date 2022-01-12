public void deleteRecord(dev.suncha.myleads.myLeads leads) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.delete(dev.suncha.myleads.DatabaseHandler.TABLE_LEADS, ((dev.suncha.myleads.DatabaseHandler.KEY_ID) + "=?"), new java.lang.String[]{ java.lang.String.valueOf(leads.get_id()) });
    db.close();
}