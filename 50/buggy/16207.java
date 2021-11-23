@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(("DROP TABLE IF EXISTS " + (MoviesContract.MovieEntry.TABLE_FAVORITE_MOVIES)));
    db.execSQL((("DELETE FROM SQLITE_SEQUENCE WHERE NAME = '" + (MoviesContract.MovieEntry.TABLE_FAVORITE_MOVIES)) + "'"));
    onCreate(db);
}