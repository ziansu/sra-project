public long saveUpgrade(int _id, int rank) {
    long id = 0;
    if (rank == 1) {
        android.database.sqlite.SQLiteDatabase db = dbHelper.getWritableDatabase();
        android.content.ContentValues values = new android.content.ContentValues();
        values.put("_id", _id);
        values.put("rank", rank);
        id = db.insert(hu.uniobuda.nik.betherichest.Interfaces.DatabaseHandler.TABLE_UPGRADES, null, values);
        db.close();
    }
    return id;
}