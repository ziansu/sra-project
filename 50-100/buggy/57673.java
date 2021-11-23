public static android.database.sqlite.SQLiteDatabase getReadableDB(android.content.Context context) {
    try {
        ru.avb.iremember.G.Log("[DB.getReadableDB]");
        ru.avb.iremember.DB.DBHelper dbHelper = new ru.avb.iremember.DB.DBHelper(context);
        android.database.sqlite.SQLiteDatabase db = dbHelper.getReadableDatabase();
    } catch (android.database.SQLException e) {
        com.crashlytics.android.Crashlytics.logException(e);
    }
    return ru.avb.iremember.DB.db;
}