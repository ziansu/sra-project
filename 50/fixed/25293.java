public static android.database.Cursor getFavoriteMovieData(android.content.Context context) {
    return context.getContentResolver().query(FavoriteMovies.CONTENT_URI, null, null, null, null);
}