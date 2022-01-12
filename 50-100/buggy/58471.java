public void addDOB(com.babyandi.stephnoutsa.babyandi.DOB dob) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.babyandi.stephnoutsa.babyandi.MyDBHandler.D_COLUMN_DAY, java.lang.String.valueOf(dob.getDday()));
    values.put(com.babyandi.stephnoutsa.babyandi.MyDBHandler.D_COLUMN_R, dob.getDreceived());
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.insert(com.babyandi.stephnoutsa.babyandi.MyDBHandler.TABLE_DOB, null, values);
    db.close();
}