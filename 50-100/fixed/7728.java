@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    android.support.v7.widget.LinearLayoutManager linearLayoutManager = ((android.support.v7.widget.LinearLayoutManager) (mRecyclerView.getLayoutManager()));
    int position = linearLayoutManager.findFirstVisibleItemPosition();
    outState.putInt(ir.blog.microc.movie.activities.MainActivity.FIRST_VISIBLE_ITEM_KEY, position);
    outState.putParcelableArrayList(ir.blog.microc.movie.activities.MainActivity.MOVIE_DATA_PARCELABLE, ((java.util.ArrayList<? extends android.os.Parcelable>) (movieList)));
}