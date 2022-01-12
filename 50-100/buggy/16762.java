public void resetLastUpdatedSteps(final int stepsSinceBoot) {
    android.database.sqlite.SQLiteDatabase db = null;
    try {
        db = getWritableDatabase();
        db.beginTransaction();
        updateOrInsertWithoutTransaction(db, com.sukesan1984.stepsensorlib.util.DateUtils.getCurrentDateAndHour(), stepsSinceBoot);
        saveLastUpdatedSteps(db, 0);
        db.setTransactionSuccessful();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        if (db != null) {
            db.endTransaction();
            db.close();
        }
    }
}