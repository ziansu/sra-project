public java.util.List<com.example.pr_idi.movierecord.Film> getAllFilmstitol() {
    java.util.List<com.example.pr_idi.movierecord.Film> comments = new java.util.ArrayList<>();
    android.database.Cursor cursor = database.query(MySQLiteHelper.TABLE_FILMS, allColumns, null, null, null, null, MySQLiteHelper.COLUMN_TITLE);
    cursor.moveToFirst();
    while (!(cursor.isAfterLast())) {
        com.example.pr_idi.movierecord.Film comment = cursorToFilm(cursor);
        comments.add(comment);
        cursor.moveToNext();
    } 
    cursor.close();
    return comments;
}