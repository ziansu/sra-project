@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String query = (((((((((((("CREATE TABLE " + (com.example.erica.recsfromtechs.MovieDB.TABLE_MOVIES)) + " (") + (com.example.erica.recsfromtechs.MovieDB.COLUMN_TITLE)) + " TEXT, ") + (com.example.erica.recsfromtechs.MovieDB.COLUMN_URATING)) + " FLOAT, ") + (com.example.erica.recsfromtechs.MovieDB.COLUMN_NUMRATING)) + " INTEGER, ") + (com.example.erica.recsfromtechs.MovieDB.COLUMN_MRATING)) + " TEXT, ") + (com.example.erica.recsfromtechs.MovieDB.COLUMN_YEAR)) + " TEXT") + ");";
    db.execSQL(query);
}