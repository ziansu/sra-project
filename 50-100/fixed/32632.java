@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    try {
        db.execSQL((((("ALTER TABLE " + (com.outsystems.android.core.DatabaseHandler.TABLE_LOGIN_APPLICATIONS)) + " ADD ") + (com.outsystems.android.core.DatabaseHandler.KEY_APPLICATION_PRELOADER)) + " NUMERIC"));
    } catch (java.lang.Exception e) {
        onCreate(db);
        e.printStackTrace();
    }
}