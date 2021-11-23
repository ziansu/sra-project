static android.content.ContentValues createTrailerValues(long id) {
    android.content.ContentValues favoriteValues = new android.content.ContentValues();
    favoriteValues.put(MovieContract.TrailerEntry.COLUMN_DESCRIPTION, "Some description");
    favoriteValues.put(MovieContract.TrailerEntry.COLUMN_FAVORITE_ID, id);
    favoriteValues.put(MovieContract.TrailerEntry.COLUMN_URI, "some uri");
    return favoriteValues;
}