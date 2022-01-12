@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.example.shoukhin.locatingfriends.MyDbHelper.CREATE_FRIEND_TABLE);
    android.util.Log.d(MapsActivity.TAG, "db created");
}