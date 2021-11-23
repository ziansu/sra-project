public void addCalories(java.lang.String calories, java.lang.String date) {
    android.content.ContentValues values = new android.content.ContentValues();
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    values.put("calories", calories);
    values.put("date", date);
    long newRowId;
    newRowId = db.insert("Calories", null, values);
    db.close();
}