public void deleteDOB() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    java.lang.String query = ("DELETE FROM " + (com.babyandi.stephnoutsa.babyandi.MyDBHandler.TABLE_DOB)) + " WHERE 1;";
    db.execSQL(query);
    com.babyandi.stephnoutsa.babyandi.DOB dob = new com.babyandi.stephnoutsa.babyandi.DOB("null", 0);
    addDOB(dob);
}