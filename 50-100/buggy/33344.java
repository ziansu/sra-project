private android.database.Cursor getArtistCursor() {
    if (!(com.andryr.musicplayer.utils.Permissions.checkPermission(getContext(), Manifest.permission.READ_EXTERNAL_STORAGE))) {
        return null;
    }
    android.net.Uri musicUri = MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI;
    java.lang.String selection = getSelectionString();
    java.lang.String[] selectionArgs = getSelectionArgs();
    java.lang.String fieldName = MediaStore.Audio.Artists.ARTIST;
    java.lang.String filter = getFilter();
    return getCursor(musicUri, com.andryr.musicplayer.loaders.ArtistLoader.sProjection, selection, selectionArgs, fieldName, filter);
}