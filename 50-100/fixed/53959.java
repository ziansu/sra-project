public boolean insert_address(java.lang.String address) {
    db = this.getWritableDatabase();
    final java.lang.String retrieveQuery = "SELECT * FROM " + (DbContract.AddressEntry.TABLE_NAME);
    android.database.Cursor data = db.rawQuery(retrieveQuery, null);
    if ((data.getCount()) <= 1) {
        android.content.ContentValues values = new android.content.ContentValues(1);
        values.put(DbContract.AddressEntry.COLUMN_ADDRESS, address);
        long successful = db.insert(DbContract.AddressEntry.TABLE_NAME, null, values);
        db.close();
        return successful > 0;
    }else
        return false;
    
}