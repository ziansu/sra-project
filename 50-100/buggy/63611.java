public boolean checkDataBase() {
    android.database.sqlite.SQLiteDatabase checkDB = null;
    try {
        java.lang.String path = getPath();
        checkDB = android.database.sqlite.SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
    } catch (android.database.sqlite.SQLiteException e) {
        e.printStackTrace();
    }
    if (checkDB != null) {
        checkDB.close();
    }
    return checkDB != null;
}