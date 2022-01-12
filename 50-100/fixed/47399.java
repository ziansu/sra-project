public void addSN(com.babyandi.stephnoutsa.babyandi.SpecialNeed specialNeed) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.babyandi.stephnoutsa.babyandi.MyDBHandler.SN_COLUMN_HIV, java.lang.String.valueOf(specialNeed.getHiv()));
    values.put(com.babyandi.stephnoutsa.babyandi.MyDBHandler.SN_COLUMN_HEPATITIS, java.lang.String.valueOf(specialNeed.getHepatitis()));
    if ((db) == null) {
        db = getWritableDatabase();
    }
    db.insert(com.babyandi.stephnoutsa.babyandi.MyDBHandler.TABLE_SPECIAL_NEEDS, null, values);
}