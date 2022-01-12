@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie_list);
    android.content.SharedPreferences prefs = getPreferences(net.nanodegree.popularmovies.MODE_PRIVATE);
    currentCriteria = prefs.getString("criteria", DEFAULT_CRITERIA);
    if ((findViewById(R.id.movie_detail_container)) != null) {
        mTwoPane = true;
        ((net.nanodegree.popularmovies.fragments.MovieGridFragment) (getSupportFragmentManager().findFragmentById(R.id.movie_list))).setActivateOnItemClick(true);
    }
    loadMovies();
}