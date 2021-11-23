private java.lang.String getAlbumTitleWithYearAsPrefix(android.database.Cursor cursor) {
    java.lang.String albumTitleWithYear = cursor.getString(MyLibrary.IDX_ALBUM);
    int releaseYear = cursor.getInt(MyLibrary.IDX_YEAR);
    if (releaseYear > 0) {
        albumTitleWithYear = (releaseYear + " - ") + albumTitleWithYear;
    }
    return albumTitleWithYear;
}