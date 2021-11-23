private void createShareDB(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String createTable = (((((((((("CREATE TABLE " + (in.codehex.shareipo.app.Config.TABLE_SHARE)) + "(") + (in.codehex.shareipo.app.Config.KEY_ID)) + " INTEGER PRIMARY KEY, ") + (in.codehex.shareipo.app.Config.KEY_USER)) + " TEXT, ") + (in.codehex.shareipo.app.Config.KEY_MAC_ID)) + " TEXT, ") + (in.codehex.shareipo.app.Config.KEY_FILE)) + " TEXT") + ")";
    db.execSQL(createTable);
}