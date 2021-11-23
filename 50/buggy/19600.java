public void openDB() {
    if ((mSQLiteDatabase.isOpen()) == false)
        mSQLiteDatabase = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(dbPath, null);
    
}