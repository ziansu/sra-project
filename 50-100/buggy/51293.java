public static void upgrade(android.database.sqlite.SQLiteDatabase db) {
    timber.log.Timber.d("MYDEBUG: upgrade()");
    try {
        db.execSQL((((("ALTER TABLE " + (com.cartlc.tracker.data.TableEntry.TABLE_NAME)) + " ADD COLUMN ") + (com.cartlc.tracker.data.TableEntry.KEY_LICENSE_PLATE)) + " text"));
    } catch (java.lang.Exception ex) {
        timber.log.Timber.e(ex);
    }
}