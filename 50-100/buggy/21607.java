@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    android.util.Log.i(com.skyline.db.jerrymouse.core.datasource.SQLiteDataSource.LOG_TAG, "onCreate");
    if ((com.skyline.db.jerrymouse.core.datasource.SQLiteDataSource.INIT_CALL_BACK) != null) {
        com.skyline.db.jerrymouse.core.datasource.SQLiteDataSource.INIT_CALL_BACK.beforeCreateTable();
    }
    createTables();
    if ((com.skyline.db.jerrymouse.core.datasource.SQLiteDataSource.INIT_CALL_BACK) != null) {
        com.skyline.db.jerrymouse.core.datasource.SQLiteDataSource.INIT_CALL_BACK.afterCreateTable(db, com.skyline.db.jerrymouse.core.datasource.SQLiteDataSource.INSTANCE);
    }
}