public long saveInvestment(int _id, int rank) {
    android.database.sqlite.SQLiteDatabase db = dbHelper.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("_id", _id);
    values.put("rank", rank);
    long id = db.insert(hu.uniobuda.nik.betherichest.Interfaces.DatabaseHandler.TABLE_INVESTMENTS, null, values);
    db.close();
    return id;
}