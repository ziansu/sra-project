public synchronized android.database.sqlite.SQLiteDatabase openDB(int type) {
    android.database.sqlite.SQLiteDatabase database = org.spinsuite.base.DB_Manager.getInstance().open();
    return database;
}