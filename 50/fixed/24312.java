private void openDataBase() {
    java.lang.String myPath = (dataBasePath) + (is.bjorfinnur.bjorfinnur.DataBaseManager.DB_NAME);
    myDataBase = android.database.sqlite.SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
}