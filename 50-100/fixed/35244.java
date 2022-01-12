@java.lang.Override
public void onSuccess(java.util.List<com.dmaila.popularmoviesapp.Movie> moviesList) {
    android.support.v7.widget.GridLayoutManager gridLayoutManager = new android.support.v7.widget.GridLayoutManager(this, 3);
    android.support.v7.widget.RecyclerView myRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.movies_recyclerview)));
    com.dmaila.popularmoviesapp.CustomAdapter customAdapter = new com.dmaila.popularmoviesapp.CustomAdapter(new java.util.ArrayList<com.dmaila.popularmoviesapp.Movie>(moviesList), this);
    myRecyclerView.setAdapter(customAdapter);
    myRecyclerView.setLayoutManager(gridLayoutManager);
}