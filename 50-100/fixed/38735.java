@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    mLastItem = (firstVisibleItem + visibleItemCount) - 1;
    if (((((mFooterView) != null) && ((mFooterView.getState()) != (WListViewFooter.STATE_LOADING))) && (totalItemCount > visibleItemCount)) && ((mLastItem) == ((getCount()) - 1))) {
        startLoadMore();
    }
}