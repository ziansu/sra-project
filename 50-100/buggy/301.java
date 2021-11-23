private java.lang.String buildSongIdFromGenreSelect(java.lang.String target, java.lang.String genreSelect) {
    final java.lang.String query = (((((((("SELECT " + target) + " FROM ") + (MediaLibrary.VIEW_SONGS_ALBUMS_ARTISTS)) + " WHERE ") + (MediaLibrary.SongColumns._ID)) + " IN (") + genreSelect) + ") GROUP BY ") + target;
    return query;
}