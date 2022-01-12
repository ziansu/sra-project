@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    if (!(isFavourited)) {
        context.getContentResolver().delete(MovieContract.MovieEntry.CONTENT_URI, ((MovieContract.MovieEntry._ID) + " = ?"), new java.lang.String[]{ movie.getId() });
    }else {
        android.content.ContentValues contentValues = com.example.android.popularmoviesstagetwo.db.DbUtils.toContentValues(movie);
        context.getContentResolver().insert(MovieContract.MovieEntry.CONTENT_URI, contentValues);
    }
    return null;
}