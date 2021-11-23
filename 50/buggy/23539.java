public void setLoadMoreEnabled(boolean enabled) {
    mLoadMoreEnabled = enabled;
    if (!enabled) {
        if ((mFootView) instanceof com.github.jdsjlzx.view.LoadingFooter) {
            mWrapAdapter.removeFooterView(mFootView);
        }
    }
}