@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
    android.util.Log.d(com.bogucki.router.database.dbHelper.TAG, ("onCreate: DB CREATED WITH FOLLOWING SCRIPT:" + (com.bogucki.router.database.dbHelper.CREATE_DATABASE)));
    getWritableDatabase().execSQL(com.bogucki.router.database.dbHelper.CREATE_DATABASE);
}