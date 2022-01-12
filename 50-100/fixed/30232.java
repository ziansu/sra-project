@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie_detail);
    getSupportActionBar().setTitle("Movie Details");
    if (savedInstanceState == null) {
        com.udacity.jeremywright.popularmovies.ui.MovieDetailActivityFragment detailFragment = new com.udacity.jeremywright.popularmovies.ui.MovieDetailActivityFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.detail_container, detailFragment).commit();
    }
}