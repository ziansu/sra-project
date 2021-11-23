@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie_grid);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.rv_movie_grid)));
    mGridLayoutManager = new android.support.v7.widget.GridLayoutManager(this, com.example.android.moviechef.MovieGridActivity.SPAN_COUNT);
    mRecyclerView.setLayoutManager(mGridLayoutManager);
    mMovieAdapter = new com.example.android.moviechef.MovieAdapter(this, this);
    mRecyclerView.setAdapter(mMovieAdapter);
    loadMovies();
}