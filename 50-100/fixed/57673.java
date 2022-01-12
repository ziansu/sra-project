public static android.database.sqlite.SQLiteDatabase getReadableDB(android.content.Context context) {
    ru.avb.iremember.G.Log("[DB.getReadableDB]");
    android.database.sqlite.SQLiteDatabase db = null;
    try {
        ru.avb.iremember.DB.DBHelper dbHelper = new ru.avb.iremember.DB.DBHelper(context);
        db = dbHelper.getReadableDatabase();
    } catch (android.database.SQLException e) {
        com.crashlytics.android.Crashlytics.logException(e);
    }
    return db;
}