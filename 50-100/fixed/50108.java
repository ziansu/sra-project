private void showLoading() {
    mIsLoading = true;
    mRefreshView.setVisibility(View.GONE);
    mLoading.setVisibility(View.VISIBLE);
    if ((mPage) == 1) {
        mObservationsGrid.setVisibility(View.GONE);
        mObservationsGridEmpty.setVisibility(View.GONE);
        mLoadingObservationsGrid.setVisibility(View.VISIBLE);
        mObservationsList.setVisibility(View.GONE);
        mLoadingObservationsList.setVisibility(View.VISIBLE);
        mObservationsListEmpty.setVisibility(View.GONE);
    }
}