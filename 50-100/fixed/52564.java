public static void onCreate(final android.database.sqlite.SQLiteDatabase db) {
    java.lang.String query = (((((((((("CREATE TABLE " + (com.nimamoradi.NotePlus.databases.ItemTable.TABLE_NAME)) + "(") + (android.provider.BaseColumns._ID)) + " INTEGER PRIMARY KEY, ") + (com.nimamoradi.NotePlus.databases.ItemTable.NAME_COLUMN)) + " VARCHAR(200),") + (com.nimamoradi.NotePlus.databases.ItemTable.NAME_COLUMN2)) + " VARCHAR(500),") + (com.nimamoradi.NotePlus.databases.ItemTable.NAME_COLUMN3)) + " TEXT") + ");";
    db.execSQL(query);
}