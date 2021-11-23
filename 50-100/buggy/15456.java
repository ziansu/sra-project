@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    upgradeDatabase = true;
    try {
        myContext.deleteDatabase(usbong.android.db.UsbongDbHelper.DATABASE_NAME);
        java.io.InputStream is = myContext.getResources().getAssets().open("usbong_store.sql");
        java.lang.String[] statements = usbong.android.db.FileHelper.parseSqlFile(is);
        for (java.lang.String statement : statements) {
            db.execSQL(statement);
        }
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}