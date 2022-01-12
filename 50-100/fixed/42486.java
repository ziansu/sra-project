private void update_main_movies() {
    mTheMovieDBAdapter.reset();
    if (isOnline()) {
        mTheMovieDBAdapter.queryPosterHashes(mCurrSortBy, mQueryPosterHandler);
        mTVError.setVisibility(View.GONE);
    }else {
        mTVError.setText(R.string.error_no_internet);
        mTVError.setVisibility(View.VISIBLE);
    }
}