private java.lang.String buildSongIdFromGenreSelect(java.lang.String genreId) {
    return (((((((("SELECT " + (MediaLibrary.GenreSongColumns.SONG_ID)) + " FROM ") + (MediaLibrary.TABLE_GENRES_SONGS)) + " WHERE ") + (MediaLibrary.GenreSongColumns._GENRE_ID)) + "=") + genreId) + " GROUP BY ") + (MediaLibrary.GenreSongColumns.SONG_ID);
}