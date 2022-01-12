private void triggerSearchMovieAsyncTask(java.lang.String queryText) {
    if ((mSearchMovieRunnable) != null) {
        mHandler.removeCallbacks(mSearchMovieRunnable);
        mSearchMovieRunnable = null;
    }
    if (android.text.TextUtils.isEmpty(queryText)) {
        return ;
    }
    mSearchMovieRunnable = new com.dl.dlexerciseandroid.ui.moviesearcher.MovieSearcherActivity.SearchMovieRunnable(queryText);
    mHandler.postDelayed(mSearchMovieRunnable, com.dl.dlexerciseandroid.ui.moviesearcher.MovieSearcherActivity.PAUSE_FOR_SEARCH_TEXT_CHANGED);
}