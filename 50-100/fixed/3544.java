public void updateOrInsert(long dateAndHour, int stepsSinceBoot) {
    android.database.sqlite.SQLiteDatabase db = null;
    try {
        db = getWritableDatabase();
        db.beginTransaction();
        updateOrInsertWithoutTransaction(db, dateAndHour, stepsSinceBoot);
        db.setTransactionSuccessful();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        if (db != null) {
            db.endTransaction();
        }
    }
}