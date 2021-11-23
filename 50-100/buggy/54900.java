private void deleteFromFavorites() {
    android.net.Uri uri = FavouritesContract.FavouriteEntry.CONTENT_URI;
    android.content.ContentResolver resolver = getApplicationContext().getContentResolver();
    long noDeleted = resolver.delete(uri, ((FavouritesContract.FavouriteEntry.COLUMN_ID) + " = ? "), new java.lang.String[]{ (movie.getId()) + "" });
}