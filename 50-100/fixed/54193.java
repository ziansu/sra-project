public int addExercise(java.lang.String name, java.lang.String description) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("name", name);
    values.put("description", description);
    try {
        db.insertOrThrow("exercise", null, values);
    } catch (java.lang.Exception e) {
        db.close();
        return 1;
    }
    db.close();
    return 0;
}