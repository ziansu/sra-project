@java.lang.Override
public void run() {
    logPosterNames(mPosters);
    mAdapter = new com.siems.udacitymovies.adapters.PosterGridAdapter(getApplicationContext(), mPosters);
    mRecyclerView.setAdapter(mAdapter);
    mGridLayoutManager = new android.support.v7.widget.GridLayoutManager(this, 2);
    mRecyclerView.setLayoutManager(mGridLayoutManager);
    mRecyclerView.addItemDecoration(new com.siems.udacitymovies.adapters.SpacesItemDecoration(0));
    mRecyclerView.setHasFixedSize(true);
}