private void showStateView(android.view.View view) {
    mErrorView.setVisibility(((mErrorView) == view ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    mEndView.setVisibility(((mEndView) == view ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    mLoadingView.setVisibility(((mLoadingView) == view ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
}