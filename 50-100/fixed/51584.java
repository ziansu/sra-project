@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie_list);
    client = new com.loopj.android.http.AsyncHttpClient();
    movies = new java.util.ArrayList<com.codepath.flixter.models.Movie>();
    adapter = new com.codepath.flixter.MovieAdapter(movies);
    butterknife.ButterKnife.bind(this);
    rvMovies.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    rvMovies.setAdapter(adapter);
    getConfiguration();
}