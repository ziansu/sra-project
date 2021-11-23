@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    migration.backupInRuntimeMemory(db);
    for (java.lang.Class<com.home.languagelearning.storage.Contract.Table> table : getTables()) {
        db.execSQL(("drop table if exists " + (com.home.languagelearning.storage.Contract.getTableName(table))));
    }
    for (java.lang.Class<com.home.languagelearning.storage.Contract.View> view : getViews()) {
        db.execSQL(("drop view if exists " + (com.home.languagelearning.storage.Contract.getTableName(view))));
    }
    onCreate(db);
}