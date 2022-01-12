@java.lang.Override
public void onScrollBottom() {
    if ((mLoadingListener) != null) {
        if (((mHeaderLayout) != null) && ((mHeaderLayout.getState()) <= (com.xadapter.widget.BaseRefreshHeader.STATE_REFRESHING))) {
            return ;
        }
        if ((mFooterLayout) != null) {
            mFooterLayout.setVisibility(View.VISIBLE);
        }
        mLoadingListener.onLoadMore();
    }
}