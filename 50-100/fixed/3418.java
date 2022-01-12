private void updatePhotosFromCursor(final android.database.Cursor c) {
    c.moveToFirst();
    final java.lang.String imageUrl = c.getString(c.getColumnIndexOrThrow(ExplorContentContract.Photos.Columns.IMAGE_URL_LARGE));
    final long photoId = c.getLong(c.getColumnIndexOrThrow(ExplorContentContract.Photos.Columns._ID));
    final android.net.Uri photoUri = ExplorContentContract.Photos.CONTENT_URI.buildUpon().appendPath(("" + photoId)).build();
    mImageContentUri = photoUri;
}