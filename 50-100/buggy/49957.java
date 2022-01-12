@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String query = ((((((((((("CREATE TABLE " + (ghost.mprog.nl.ghost.DBHelper.TABLE_PLAYERS)) + " (") + (ghost.mprog.nl.ghost.DBHelper.KEY_ID)) + " INTEGER PRIMARY KEY AUTOINCREMENT, ") + (ghost.mprog.nl.ghost.DBHelper.KEY_NAME)) + " VARCHAR, ") + (ghost.mprog.nl.ghost.DBHelper.KEY_GAMES_PLAYED)) + " INTEGER, ") + (ghost.mprog.nl.ghost.DBHelper.KEY_GAMES_WON)) + " INTEGER, ") + (ghost.mprog.nl.ghost.DBHelper.KEY_LIVES_LOST)) + " INTEGER)";
    android.util.Log.d("query", query);
    db.execSQL(query);
}