public void clear() {
    if (((mViewsData) == null) || ((mViewsData.size()) == 0)) {
        return ;
    }
    mViewsData.clear();
    mViewCount = 1;
    notifyDataSetChanged();
    isShowNoMore = false;
    mLoadMoreView.setVisibility(View.GONE);
    mNoMoreView.setVisibility(View.GONE);
}