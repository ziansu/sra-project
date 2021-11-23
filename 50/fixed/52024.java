public static android.content.UriMatcher buildUriMatcher() {
    android.content.UriMatcher uriMatcher = new android.content.UriMatcher(android.content.UriMatcher.NO_MATCH);
    uriMatcher.addURI(MovieContract.AUTHORITY, MovieContract.PATH_MOVIE, 100);
    uriMatcher.addURI(MovieContract.AUTHORITY, ((MovieContract.PATH_MOVIE) + "/#"), 101);
    return uriMatcher;
}