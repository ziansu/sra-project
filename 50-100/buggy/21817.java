@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    int numHeaders = mMenuListView.getHeaderViewsCount();
    if (position < numHeaders) {
        return ;
    }
    int numFooters = mMenuListView.getFooterViewsCount();
    int menuItemsCount = mMenuListAdapter.getCount();
    if (position >= (menuItemsCount + numFooters)) {
        return ;
    }
    selectMenuItem((position - numHeaders));
}