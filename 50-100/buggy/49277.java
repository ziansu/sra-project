private void triggerSearchMovieAsyncTask(java.lang.String queryText) {
    if (android.text.TextUtils.isEmpty(queryText)) {
        return ;
    }
    if ((mSearchMovieRunnable) != null) {
        mHandler.removeCallbacks(mSearchMovieRunnable);
        mSearchMovieRunnable = null;
    }
    mSearchMovieRunnable = new com.dl.dlexerciseandroid.ui.moviesearcher.MovieSearcherActivity.SearchMovieRunnable(queryText);
    mHandler.postDelayed(mSearchMovieRunnable, com.dl.dlexerciseandroid.ui.moviesearcher.MovieSearcherActivity.PAUSE_FOR_SEARCH_TEXT_CHANGED);
}