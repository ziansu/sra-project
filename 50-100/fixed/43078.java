@java.lang.Override
public void onTaskComplete(java.util.ArrayList<com.example.android.popularmoviesapp.Model.MoviePosters> result) {
    MainMoviePosters.addAll(result);
    mRecyclerAdapter = new com.example.android.popularmoviesapp.Adapter.RecyclerAdapter(this, this, MainMoviePosters);
    android.support.v7.widget.GridLayoutManager gridLayoutManager = new android.support.v7.widget.GridLayoutManager(this, getResources().getInteger(R.integer.num_columns_recycler_view));
    mRecyclerView.setLayoutManager(gridLayoutManager);
    mRecyclerView.setHasFixedSize(true);
    progressBar.setVisibility(View.INVISIBLE);
    mRecyclerView.setAdapter(mRecyclerAdapter);
}