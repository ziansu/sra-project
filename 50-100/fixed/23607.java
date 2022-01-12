@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    android.app.ActionBar actionBar = org.androidfromfrankfurt.archnews.NewsActivity.getThis().getActionBar();
    if (((mLastFirstVisibleItem) < firstVisibleItem) && (actionBar.isShowing())) {
        actionBar.hide();
    }
    if (((mLastFirstVisibleItem) > firstVisibleItem) && (!(actionBar.isShowing()))) {
        actionBar.show();
    }
    mLastFirstVisibleItem = firstVisibleItem;
}