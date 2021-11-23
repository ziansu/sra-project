@java.lang.Override
protected java.util.List<uk.co.ourfriendirony.medianotifier.autogen.movie.Movie> doInBackground(java.lang.String... strings) {
    java.lang.String string = strings[0];
    try {
        movies = client.queryMovie(string);
    } catch (java.io.IOException e) {
        movies = new java.util.ArrayList<>();
    }
    return movies;
}