@java.lang.Override
public void onRateDone(float rate) {
    mFilterMovieSpinner.setSelection(0);
    movienight.javi.com.movienight.model.FilterableItem item = new movienight.javi.com.movienight.model.RateFIlterableItem(rate);
    movienight.javi.com.movienight.adapters.FilterRecyclerViewAdapter adapter = ((movienight.javi.com.movienight.adapters.FilterRecyclerViewAdapter) (mFilterRecyclerView.getAdapter()));
    adapter.addFilterItem(item);
}