public void deleteAll() {
    android.database.sqlite.SQLiteDatabase db = null;
    try {
        db = getWritableDatabase();
        db.delete(com.sukesan1984.stepsensorlib.Database.TABLE_NAME, "", new java.lang.String[]{  });
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}