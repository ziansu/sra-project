@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(("DROP TABLE IF EXISTS " + (MoviesContract.MoviesEntry.TABLE_NAME)));
    db.execSQL(("DROP TABLE IF EXISTS " + (MoviesContract.VideoEntry.TABLE_NAME)));
    db.execSQL(("DROP TABLE IF EXISTS " + (MoviesContract.ReviewEntry.TABLE_NAME)));
}