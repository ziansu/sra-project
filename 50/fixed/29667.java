@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    android.util.Log.v(database.DatabaseHelper.TAG, TaskContract.CREATE_TABLE);
    db.execSQL(TaskContract.DELETE_TABLE);
    db.execSQL(TaskContract.CREATE_TABLE);
}