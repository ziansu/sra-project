@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    int numHeaders = mMenuListView.getHeaderViewsCount();
    if (position < numHeaders) {
        return ;
    }
    int menuItemsCount = mMenuListAdapter.getCount();
    if ((position - numHeaders) >= menuItemsCount) {
        return ;
    }
    selectMenuItem((position - numHeaders));
}