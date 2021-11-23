@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie_detail);
    com.talosdev.movies.ui.MovieDetailsFragment fragment = ((com.talosdev.movies.ui.MovieDetailsFragment) (getFragmentManager().findFragmentById(R.id.movie_details_fragment)));
    long movieId = getIntent().getLongExtra(Intents.EXTRA_MOVIE_ID, 0L);
    fragment.setMovieId(movieId);
    com.talosdev.movies.remote.FetchMovieDetailsTask fetcher = new com.talosdev.movies.remote.FetchMovieDetailsTask(this);
    fetcher.execute(movieId);
}