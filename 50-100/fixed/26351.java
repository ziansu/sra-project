private void setEmptyShown(boolean shown) {
    if ((mEmptyView) == null) {
        mRecycler.setVisibility((shown ? android.view.View.GONE : android.view.View.VISIBLE));
        return ;
    }
    mRecycler.setVisibility((shown ? android.view.View.GONE : android.view.View.VISIBLE));
    mEmptyView.setVisibility((shown ? android.view.View.VISIBLE : android.view.View.GONE));
}