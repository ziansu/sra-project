private void showProgress(boolean showProgress) {
    mControllerView.setVisibility((showProgress ? GONE : VISIBLE));
    mLoadingView.setVisibility((showProgress ? VISIBLE : GONE));
}