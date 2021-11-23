public void addNewTaskTable(java.lang.String milliIdentifier) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    java.lang.String SQL_DROP_TABLE_IF_EXISTS = ("DROP TABLE IF EXISTS " + milliIdentifier) + ";";
    java.lang.String SQL_CREATE_TABLE = ((((((("CREATE TABLE " + milliIdentifier) + " (") + (net.coffeewarriors.just10minutes.data.TasksContract.COLUMN_ID)) + " INTEGER PRIMARY KEY AUTOINCREMENT, ") + (net.coffeewarriors.just10minutes.data.TasksContract.COLUMN_DATE)) + " TEXT, ") + (net.coffeewarriors.just10minutes.data.TasksContract.COLUMN_DONE_STATE)) + " INTEGER);";
    db.execSQL(SQL_DROP_TABLE_IF_EXISTS);
    db.execSQL(SQL_CREATE_TABLE);
    db.close();
}