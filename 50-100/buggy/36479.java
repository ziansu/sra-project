private void changeNoInternetVisibility(boolean isInternetConnected) {
    java.lang.String currentSortOrder = com.henriquenfaria.popularmovies.common.Utils.getSortPref(this);
    if (isInternetConnected || (com.henriquenfaria.popularmovies.common.Utils.isFavoriteSort(this, currentSortOrder))) {
        mNoInternetConnectionFragmentContainer.setVisibility(View.GONE);
        mMoviesFragmentContainer.setVisibility(View.VISIBLE);
        if (mIsTwoPane) {
            mDetailsFragmentContainer.setVisibility(View.VISIBLE);
        }
    }else {
        mNoInternetConnectionFragmentContainer.setVisibility(View.VISIBLE);
        mMoviesFragmentContainer.setVisibility(View.GONE);
        if (mIsTwoPane) {
            mDetailsFragmentContainer.setVisibility(View.GONE);
        }
    }
}