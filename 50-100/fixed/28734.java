public long insertTutorDetails(java.lang.String jsonObjectInStringFormat) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("tutorCredentials", jsonObjectInStringFormat);
    long rowId = db.insert(support.DataBaseHelper.TUTOR_DETAILS_TABLE_NAME, null, values);
    db.close();
    return rowId;
}