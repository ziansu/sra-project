@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    org.androidfromfrankfurt.archnews.NewsActivity newsActivity = org.androidfromfrankfurt.archnews.NewsActivity.getThis();
    android.app.ActionBar actionBar = newsActivity.getActionBar();
    if (((mLastFirstVisibleItem) < firstVisibleItem) && (actionBar.isShowing())) {
        actionBar.hide();
    }
    if (((mLastFirstVisibleItem) > firstVisibleItem) && (!(actionBar.isShowing()))) {
        actionBar.show();
    }
    mLastFirstVisibleItem = firstVisibleItem;
}