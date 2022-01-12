public void setLoadMoreEnabled(boolean loadMoreEnabled) {
    isLoadMoreEnabled = loadMoreEnabled;
    if ((com.kogimobile.android.baselibrary.app.base.recyclerview.BaseFragmentMVPList.getAdapter()) != null) {
        com.kogimobile.android.baselibrary.app.base.recyclerview.BaseFragmentMVPList.getAdapter().setLoadMoreEnabled(loadMoreEnabled);
    }
}