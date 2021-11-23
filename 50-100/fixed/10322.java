@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(transcend.rockeeper.sqlite.DatabaseHelper.routes.createTable());
    db.execSQL(transcend.rockeeper.sqlite.DatabaseHelper.goals.createTable());
    db.execSQL(transcend.rockeeper.sqlite.DatabaseHelper.notes.createTable());
    db.execSQL(transcend.rockeeper.sqlite.DatabaseHelper.locations.createTable());
    db.execSQL(transcend.rockeeper.sqlite.DatabaseHelper.settings.createTable());
}