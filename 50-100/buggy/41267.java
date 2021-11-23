public static android.net.Uri addToFavorites(long quoteID, android.content.Context context) {
    com.android.people.quotesandroidapp.provider.status.StatusContentValues contentValues = new com.android.people.quotesandroidapp.provider.status.StatusContentValues();
    contentValues.putQuoteid(((int) (quoteID))).putFavorite(true);
    android.net.Uri result = context.getContentResolver().insert(StatusColumns.CONTENT_URI, contentValues.values());
    android.widget.Toast.makeText(context, "Added to Favorites", Toast.LENGTH_SHORT).show();
    return result;
}