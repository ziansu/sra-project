@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    android.util.Log.w(com.giao.ordersystem.TableDAO.class.getName(), "Upgrading database from old to new version...");
    db.execSQL(("DROP TABLE IF EXISTs " + (com.giao.ordersystem.DatabaseHelper.TABLE_TABLES)));
    db.execSQL(("DROP TABLE IF EXISTs " + (com.giao.ordersystem.DatabaseHelper.TABLE_MENU)));
    db.execSQL(("DROP TABLE IF EXISTs " + (com.giao.ordersystem.DatabaseHelper.TABLE_CATEGORY)));
    db.execSQL(("DROP TABLE IF EXISTs " + (com.giao.ordersystem.DatabaseHelper.TABLE_ORDER)));
    db.execSQL(("DROP TABLE IF EXISTs " + (com.giao.ordersystem.DatabaseHelper.TABLE_ORDERDETAIL)));
    onCreate(db);
}