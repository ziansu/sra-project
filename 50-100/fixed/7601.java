private rx.Observable<java.util.List<java.lang.String>> movieGenres(com.akobylianskiy.movies.data.entity.MovieEntity movieEntity) {
    return db.createQuery(MovieGenreDb.TABLE_NAME, MovieGenreDb.SELECT_MOVIE_GENRES, movieEntity.getId()).mapToList(new rx.functions.Func1<android.database.Cursor, java.lang.String>() {
        @java.lang.Override
        public java.lang.String call(android.database.Cursor cursor) {
            return com.akobylianskiy.movies.data.cache.table.MovieGenreDb.map(cursor).genreId();
        }
    }).first();
}