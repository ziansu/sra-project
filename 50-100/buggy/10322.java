@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL((((((transcend.rockeeper.sqlite.DatabaseHelper.routes.createTable()) + (transcend.rockeeper.sqlite.DatabaseHelper.goals.createTable())) + (transcend.rockeeper.sqlite.DatabaseHelper.notes.createTable())) + (transcend.rockeeper.sqlite.DatabaseHelper.locations.createTable())) + (transcend.rockeeper.sqlite.DatabaseHelper.settings.createTable())));
}