@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie_detail);
    if (savedInstanceState == null)
        getSupportFragmentManager().beginTransaction().add(R.id.details_container, new com.example.mlanka.popularmovies.MovieDetailActivityFragment()).commit();
    
}