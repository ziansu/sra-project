public void addLMP(com.babyandi.stephnoutsa.babyandi.LMP lmp) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.babyandi.stephnoutsa.babyandi.MyDBHandler.LMP_COLUMN_DATE, java.lang.String.valueOf(lmp.getLmpdate()));
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.insert(com.babyandi.stephnoutsa.babyandi.MyDBHandler.TABLE_LMP, null, values);
    db.close();
}