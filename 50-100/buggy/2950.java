public android.database.Cursor swapCursor(android.database.Cursor newCursor) {
    if (newCursor == (mCursor)) {
        return newCursor;
    }
    android.database.Cursor oldCursor = mCursor;
    mCursor = newCursor;
    if (newCursor != null) {
        mColId = newCursor.getColumnIndexOrThrow(MediaStore.Audio.Media._ID);
        mColTitle = newCursor.getColumnIndexOrThrow(MediaStore.Audio.Media.TITLE);
        mColAlbumId = newCursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ALBUM_ID);
    }
    notifyDataSetChanged();
    return oldCursor;
}