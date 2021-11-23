public android.database.Cursor getGenreID(ch.riverworld.collector.DatabaseOperations dop, java.lang.String genre) {
    android.database.sqlite.SQLiteDatabase db = dop.getReadableDatabase();
    java.lang.String[] columns = new java.lang.String[]{ DatabaseInfo.GENRES_ID_COL , DatabaseInfo.GENRES_GENRE_COL };
    android.database.Cursor crs = db.query(DatabaseInfo.GENRES_TABLE, columns, ((DatabaseInfo.GENRES_GENRE_COL) + " like ?"), new java.lang.String[]{ genre + "%" }, null, null, null);
    return crs;
}