private void showStateView(android.view.View view) {
    if ((mErrorView) != null) {
        mErrorView.setVisibility(((mErrorView) == view ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    }
    if ((mEndView) != null) {
        mEndView.setVisibility(((mEndView) == view ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    }
    if ((mLoadingView) != null) {
        mLoadingView.setVisibility(((mLoadingView) == view ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    }
}