public void deleteFavorite(android.database.Cursor cursor) {
    int id = cursor.getInt(0);
    java.lang.String stringId = java.lang.Integer.toString(id);
    android.net.Uri uri = MovieContract.FavoriteEntry.CONTENT_URI;
    uri = uri.buildUpon().appendPath(stringId).build();
    getContentResolver().delete(uri, null, null);
    finish();
}