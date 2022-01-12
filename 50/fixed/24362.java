public static kamini.app.moviecollection.MovieLoader newMovieFaboriteInstance(android.content.Context context, java.lang.String movieSelection) {
    return new kamini.app.moviecollection.MovieLoader(context, MovieContract.MovieEntry.buildMovieFavoriteStatus(movieSelection, "1", "1"));
}