public void addDOB(com.babyandi.stephnoutsa.babyandi.DOB dob) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.babyandi.stephnoutsa.babyandi.MyDBHandler.D_COLUMN_DAY, java.lang.String.valueOf(dob.getDday()));
    if ((db) == null) {
        db = getWritableDatabase();
    }
    db.insert(com.babyandi.stephnoutsa.babyandi.MyDBHandler.TABLE_DOB, null, values);
}