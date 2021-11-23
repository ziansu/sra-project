@java.lang.Override
public rx.Observable<java.util.List<com.akobylianskiy.movies.data.entity.GenreEntity>> genres() {
    return db.createQuery(GenreDb.TABLE_NAME, GenreDb.SELECT_ALL).mapToList(new rx.functions.Func1<android.database.Cursor, com.akobylianskiy.movies.data.entity.GenreEntity>() {
        @java.lang.Override
        public com.akobylianskiy.movies.data.entity.GenreEntity call(android.database.Cursor cursor) {
            return com.akobylianskiy.movies.data.cache.table.GenreDb.map(cursor);
        }
    }).first();
}