@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL((((((transcend.rockeeper.sqlite.DatabaseHelper.routes.dropTable()) + (transcend.rockeeper.sqlite.DatabaseHelper.goals.dropTable())) + (transcend.rockeeper.sqlite.DatabaseHelper.notes.dropTable())) + (transcend.rockeeper.sqlite.DatabaseHelper.locations.dropTable())) + (transcend.rockeeper.sqlite.DatabaseHelper.settings.dropTable())));
    onCreate(db);
}