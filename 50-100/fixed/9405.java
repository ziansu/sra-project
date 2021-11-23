@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(transcend.rockeeper.sqlite.DatabaseHelper.routes.dropTable());
    db.execSQL(transcend.rockeeper.sqlite.DatabaseHelper.goals.dropTable());
    db.execSQL(transcend.rockeeper.sqlite.DatabaseHelper.notes.dropTable());
    db.execSQL(transcend.rockeeper.sqlite.DatabaseHelper.locations.dropTable());
    db.execSQL(transcend.rockeeper.sqlite.DatabaseHelper.settings.dropTable());
    onCreate(db);
}