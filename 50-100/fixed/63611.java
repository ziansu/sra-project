public boolean checkDataBase() {
    android.database.sqlite.SQLiteDatabase checkDB;
    try {
        java.lang.String path = getPath();
        checkDB = android.database.sqlite.SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
    } catch (android.database.sqlite.SQLiteException e) {
        checkDB = null;
    }
    if (checkDB != null) {
        checkDB.close();
    }
    return checkDB != null;
}