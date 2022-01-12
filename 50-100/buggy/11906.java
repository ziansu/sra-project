@java.lang.Override
public void showEmpty() {
    mobymagic.com.javalagos.utils.LogUtils.d(mobymagic.com.javalagos.ui.userslist.BaseUserListFragment.LOG_TAG, "Showing empty");
    if ((mPlaceHolderView.getViewCount()) < 1) {
        mProgressView.setVisibility(View.GONE);
        mErrorContainerView.setVisibility(View.GONE);
        mEmptyContainerView.setVisibility(View.VISIBLE);
    }
    mPlaceHolderView.noMoreToLoad();
}