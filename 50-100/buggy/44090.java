private void showNoCategories() {
    mLoadWheel.setVisibility(View.GONE);
    mHelloText.setVisibility(View.VISIBLE);
    mCategorySpinner.setVisibility(View.VISIBLE);
    mCategorySpinner.setEnabled(false);
    mCategorySpinner.setSelection(0);
    mRouteSpinner.setVisibility(View.VISIBLE);
    mRouteSpinner.setEnabled(false);
    mRouteSpinner.setSelection(0);
    mRouteNextButton.setVisibility(View.VISIBLE);
    mRouteNextButton.setEnabled(false);
}