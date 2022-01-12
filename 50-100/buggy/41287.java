private void configureAdapter(java.util.ArrayList<com.example.android.popmovies.model.Movie> favoriteMovies, java.util.ArrayList<android.graphics.drawable.Drawable> moviesThumbnail) {
    mAdapter.initializeAdapter(getContext(), favoriteMovies, moviesThumbnail);
    if ((mRecyclerView.getAdapter()) == null) {
        mRecyclerView.setAdapter(mAdapter);
    }else {
        mAdapter.notifyDataSetChanged();
    }
}