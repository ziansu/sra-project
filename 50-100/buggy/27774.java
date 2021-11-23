@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    java.lang.String DROP_TABLE;
    java.lang.String DROP_Profile_TABLE = "DROP TABLE IF EXISTS " + "profile";
    java.lang.String DROP_Pregnant_TABLE = "DROP TABLE IF EXISTS " + "pregnant";
    DROP_TABLE = DROP_Profile_TABLE + DROP_Pregnant_TABLE;
    db.execSQL(DROP_TABLE);
    android.util.Log.i(TAG, ((("Upgrade Database from " + oldVersion) + " to ") + newVersion));
    onCreate(db);
}