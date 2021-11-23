@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    if (!(isFavourited)) {
        android.content.ContentValues contentValues = com.example.android.popularmoviesstagetwo.db.DbUtils.toContentValues(movie);
        context.getContentResolver().insert(MovieContract.MovieEntry.CONTENT_URI, contentValues);
    }else {
        context.getContentResolver().delete(MovieContract.MovieEntry.CONTENT_URI, ((MovieContract.MovieEntry._ID) + " = ?"), new java.lang.String[]{ movie.getId() });
    }
    return null;
}