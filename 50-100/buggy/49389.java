public static net.pilpin.nanodegree_popularmovies.MovieTrailers_Fragment newInstance(android.net.Uri data, long movieApiId) {
    android.os.Bundle args = new android.os.Bundle();
    args.putLong(MovieDetails_Activity.MOVIE_ID, java.lang.Long.decode(data.getLastPathSegment()));
    args.putLong(MovieDetails_Activity.MOVIE_API_ID, movieApiId);
    net.pilpin.nanodegree_popularmovies.MovieTrailers_Fragment fragment = new net.pilpin.nanodegree_popularmovies.MovieTrailers_Fragment();
    fragment.setArguments(args);
    fragment.setHasOptionsMenu(true);
    return fragment;
}