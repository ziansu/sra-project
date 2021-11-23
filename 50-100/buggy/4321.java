public int updateMovieWatched(java.lang.Boolean watched, java.lang.Long dbId, long watchedDate) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(BaseDao.MovieEntry.COLUMN_MOVIE_WATCHED, (watched ? 1 : 0));
    values.put(BaseDao.MovieEntry.COLUMN_MOVIE_WATCHED_DATE, watchedDate);
    java.lang.String selection = (BaseDao.MovieEntry._ID) + " LIKE ?";
    java.lang.String[] where = new java.lang.String[]{ java.lang.String.valueOf(dbId) };
    int affectedRows = movieDao.update(values, selection, where);
    return affectedRows;
}