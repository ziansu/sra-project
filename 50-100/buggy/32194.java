@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    for (java.lang.Class<com.home.languagelearning.storage.Contract.Table> table : getTables()) {
        db.execSQL(getTableDDL(table));
    }
    for (java.lang.Class<com.home.languagelearning.storage.Contract.View> view : getViews()) {
        db.execSQL(getViewDDL(view));
    }
    migration.initByBackup(db);
}