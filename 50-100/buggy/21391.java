@java.lang.Override
public void onGlobalLayout() {
    rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    int gridWidth = mGridViewMovies.getWidth();
    int optimalColumnCount = java.lang.Math.max(java.lang.Math.round(((1.0F * gridWidth) / (desiredColumnWidth))), 1);
    mGridViewMovies.setNumColumns(optimalColumnCount);
    android.util.Log.v(LOG_TAG, ((("gridWidth  " + gridWidth) + " optimalColumnCount ") + optimalColumnCount));
    mMovieAdapter = new com.ksripati.android.popularmovies.adapters.MovieAdapter(getActivity(), mMoviesList);
    mGridViewMovies.setAdapter(mMovieAdapter);
}