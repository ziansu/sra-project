@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie_detail);
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().add(R.id.activity_movie_detail, new br.com.carlos.popularmovies.MovieDetailFragment()).commit();
    }
}