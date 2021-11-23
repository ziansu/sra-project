@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    final java.lang.String SQL_CREATE_FAV_MOVIE_TABLE = (((((((((((((("CREATE TABLE " + (FavMovieContract.FavMovieEntry.TABLE_NAME)) + " (") + (FavMovieContract.FavMovieEntry._ID)) + " INTEGER PRIMARY KEY AUTOINCREMENT,") + (FavMovieContract.FavMovieEntry.COLUMN_MOVIE_ID)) + " TEXT UNIQUE NOT NULL, ") + (FavMovieContract.FavMovieEntry.COLUMN_ORIGINAL_TITLE)) + " TEXT NOT NULL, ") + (FavMovieContract.FavMovieEntry.COLUMN_OVERVIEW)) + " REAL NOT NULL, ") + (FavMovieContract.FavMovieEntry.COLUMN_POSTER_PATH)) + " REAL NOT NULL, ") + (FavMovieContract.FavMovieEntry.COLUMN_VOTE_AVERAGE)) + " REAL NOT NULL ") + " );";
    db.execSQL(SQL_CREATE_FAV_MOVIE_TABLE);
}